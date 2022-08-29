
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj_11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> q = new LinkedList<>();

        StringTokenizer sd = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(sd.nextToken());

        int K = Integer.parseInt(sd.nextToken());

        for(int i = 1; i <= N; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while (q.size()>1){
            for(int i = 0;i < K -1 ; i++){
                // 맨 앞에 숫자를 지우고 그 숫자를 뒤에 넣음
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }

        sb.append(q.poll()).append('>');
        System.out.println(sb);

    }
}
