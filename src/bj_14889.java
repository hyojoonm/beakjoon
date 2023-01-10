import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_14889 {
    static int n;
    static int[][] arr;
    static boolean[] vis;
    static int Min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        vis = new boolean[n]; // 방문 여부


        for (int i = 0; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j <n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        combi(0,0);
        System.out.println(Min);
    }
    // 인덱스와 조합개수(=재귀 깊이)
    private static void combi(int index, int count) {

        // 팀 조합이 완성될 경우
        if (count == n/2)
        {
            // 최소값 찾기
            diff();
            return;
        }

        for (int i = index; i<n;i++){
            if (!vis[i]){
                vis[i] = true;
                combi(i+1,count+1);
                vis[i] = false;
            }
        }
    }

    private static void diff() {
        int start = 0;
        int end =0;

        for (int i = 0;i<n-1;i++){
            for (int j = i+1;j<n;j++){
                if(vis[i] == true && vis[j] == true){
                    start += arr[i][j];
                    end += arr[j][i];
                }

                else if (vis[i] == false && vis[j] == false){
                    start += arr[i][j];
                    end += arr[j][i];
                }
            }
        }

        int val = Math.abs(start-end);

        if(val == 0){
            System.out.println(val);
            System.exit(0);
        }

        Min = Math.min(val,Min);
    }
}
