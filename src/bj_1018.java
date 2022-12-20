import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj_1018 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());


        String s = br.readLine();
        char[] array = s.toCharArray();
        int sum = 0;

        for (int i=0;i<num;i++){
            sum += array[i] - '0';
        }
        System.out.println(sum);
    }
}
