import java.io.*;
import java.util.Stack;

public class bj_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] res = new int[n];
        String[] str = br.readLine().split(" ");

        for (int i =0; i < n; i++){
            A[i] = Integer.parseInt(str[i]);
        }

        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for (int i = 1 ;i<n; i++){
            while (!stack.isEmpty() && A[stack.peek()]<A[i]){
                res[stack.peek()] = A[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            res[stack.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(res[i]).append(' ');
        }

        System.out.println(sb);
    }
}
