import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_11659 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());



       /*  리펙토링 전
       int[] arr = new int[a+1];
       StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        for (int i = 1 ; i<=a ; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        // 합배열 생성
        int[] sum = new int[a+1];
        sum[1] = arr[1];
        for (int i = 2; i <=a; i++){
            sum[i] = sum[i-1] + arr[i];
        }
        */
        // 리펙토링 후 기존 배열은 문제에서 필요가 없으니 그냥 합배열 생성
        long[] sum = new long[a+1];
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i =1;i<=a;i++){
            sum[i] = sum[i-1] + Integer.parseInt(st1.nextToken());
        }
        for (int i = 0; i<b;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int c = Integer.parseInt(st2.nextToken());
            int d = Integer.parseInt(st2.nextToken());
            // ex) 1, 3 일 경우 sum[3] - sum[1-0] = 12 - 0 = 12
            // 합 배열 생성하면 연산과정 생략 가능
            System.out.println(sum[d] - sum[c-1]);
        }

    }
}
