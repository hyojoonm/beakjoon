import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bj_1427 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[str.length()];

        for (int i =0;i<str.length();i++){
            arr[i] = Integer.parseInt(str.substring(i,i+1));
        }

        for (int i = 0;i<str.length();i++){
            int max = i;
            for (int j = i+1; j<str.length();j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            if (arr[max] > arr[i]){
                int tem = arr[i];
                arr[i] = arr[max];
                arr[max] = tem;
            }
        }
        for(int i = 0;i<str.length();i++){
            System.out.print(arr[i]);
        }
    }
}
