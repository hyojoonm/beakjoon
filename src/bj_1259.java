import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true ){

            String str = br.readLine();

            StringBuffer sb = new StringBuffer(str);

            if(str.equals("0")){

                break;
            }

            if(str.equals(sb.reverse().toString())   ){
                System.out.println("yes");
            }

            else
                System.out.println("no");
        }


    }
}
