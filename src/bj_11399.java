import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_11399 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 배열 정렬
//        Arrays.sort(arr);

        for (int i =1;i<n;i++){
            int point = i;
            int value = arr[i];

            for (int j = i-1;j>=0;j--){
                if (arr[j] < arr[i]){
                    point = j+1;
                    break;
                }
                if (j == 0){
                    point = 0;
                }
            }

            for (int j =i;j>point;j--){
                arr[j] = arr[j-1];
            }

            arr[point] = value;
        }
        int sum = arr[0];
        for (int j = 1; j < arr.length; j++) {
            // 전 사람이 기다린 시간도 더함
            arr[j] += arr[j-1];
            sum += arr[j];
        }
        System.out.println(sum);
    }
}
