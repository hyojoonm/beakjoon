import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj_1966 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        StringTokenizer sy ;
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n ; i++){
             st = new StringTokenizer(br.readLine(), " ");
            int b = Integer.parseInt(st.nextToken());

            int[] num = new int[b];
            int c = Integer.parseInt(st.nextToken());

            sy = new StringTokenizer(br.readLine());
            int j = 0;
            while (sy.hasMoreTokens()) {

                st = new StringTokenizer(br.readLine(), " ");
                num[j] = Integer.parseInt(st.nextToken());
                j++;
            }

            System.out.println("num[j] = " +Arrays.toString(num));
        }
        br.close();
    }

}
