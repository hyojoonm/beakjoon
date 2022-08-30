import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj_1475 {
    public static void main(String[] args) throws IOException {

        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));

        String str = sb.readLine();
        int num = 0;
        int[] temp = new int[10];
        int max = 0;
        for(int i = 0;i<str.length();i++){
            num = str.charAt(i) - '0';
            temp[num]++;
        }

        int k = temp[9]+ temp[6];

        if(k%2 == 0){
            temp[6] = k/2;
            temp[9] = k/2;
        }
        else {
            temp[6] = k/2 +1 ;
            temp[9] = k/2 +1 ;
        }

        for(int i : temp){
            max= Math.max(max,i);
        }

        System.out.println(max);
    }
}
