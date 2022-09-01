import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj_1018 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x  = Integer.parseInt(st.nextToken());

        int y  = Integer.parseInt(st.nextToken());

        int w  = Integer.parseInt(st.nextToken());

        int h  = Integer.parseInt(st.nextToken());


        int ymin = Math.min(y,h-y);

        int xmin = Math.min(x,w-x);

        if(ymin<xmin)
        {
            System.out.println(ymin);
        }
        else
            System.out.println(xmin);
    }
}
