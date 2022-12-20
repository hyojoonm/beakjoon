import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        for (int i =0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int i =0; // 작은 수
        int j = N-1; // 큰 수
        while (i<j){
            if (arr[i] + arr[j] < M){ // 두 수의 합이 M보다 작으면 작은 수 증가
                i++;
            }
            else if(arr[i] + arr[j] > M){ // 두 수의 합이 M보다 크면 큰 수 감소
                j--;
            }
            else {  // 같으면 카운팅하고 작은 수 증가 큰 수 감소해서 또 탐색
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
