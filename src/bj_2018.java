import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum = 1;
        int start = 1;
        int end = 1;
        int count = 1;

        while (end != n){
            if (sum == n){
                count++;
                end++;
                sum += end;
            } else if (sum > n) {
                sum = sum - start;
                start++;
            }
            else {
                end++;
                sum = sum + end;
            }
        }

        System.out.println(count);
    }
}
