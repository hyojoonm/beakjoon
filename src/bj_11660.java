import java.io.*;
import java.util.StringTokenizer;

public class bj_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n+1][n+1];
        int[][] sum = new int[n+1][n+1];
        for (int i =1; i<=n;i++){

            st = new StringTokenizer(br.readLine());
            for (int j=1;j<=n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 합 배열 생성
        for (int i =1; i<=n;i++){
            for (int j=1;j<=n;j++){
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + arr[i][j];
            }
        }


        for (int i =0;i<num;i++){
            st = new StringTokenizer(br.readLine());
             int x1 = Integer.parseInt(st.nextToken());
             int y1 = Integer.parseInt(st.nextToken());
             int x2 = Integer.parseInt(st.nextToken());
             int y2 = Integer.parseInt(st.nextToken());

            int result = sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1];
            sb.append(result).append('\n');
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();

    }
}
