import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2023 {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(br.readLine());

        dfs(2,1);
        dfs(3,1);
        dfs(5,1);
        dfs(7,1);
    }

    private static void dfs(int number, int jarjsu) {
        if (jarjsu == n){
            if (isPrime(number)){
                System.out.println(number);
            }
            return;
        }
        for (int i =1; i<10;i++){
            if (i % 2 ==0){
                continue;
            }
            if (isPrime(number*10 + i)){
                dfs(number*10 +i , jarjsu+1);
            }
        }
    }

    private static boolean isPrime(int num) {
        for (int i =2; i<num/2 ; i++){
            if (num % i == 0)
                return false;
        }
        return true;

    }
}
