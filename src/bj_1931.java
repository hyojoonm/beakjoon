import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
    그리디 알고리즘 문제
    서로 겹치지 않는 활동에 대해 종료시간이 빠르면 더 많은 활동을 선택할 수 있는 시간이 많아진다
    종료 시간이 빠를수록 더 많은 회의를 할 수 있음
    종료 시간을 기준으로 정렬하여
 */
public class bj_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for(int i =0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            arr[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간

        }

        // 종료 시점 기준으로 정렬
        Arrays.sort(arr, new Comparator<int[]>()   {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){ // 종료 시간이 같으면 시작 시간이 빠른 순으로 정렬
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int prev = 0;

        for (int i =0;i<n;i++){

            if(prev <= arr[i][0]){
                prev = arr[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
