import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr =new int[n][n];

        StringTokenizer st =null;

        // 우선 순위 큐 선언 오름차순으로 알아서 정렬 함
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i<n;i++){
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j<n;j++){
                int num = Integer.parseInt(st.nextToken());
                if(queue.size() == n){
                    // 큐 사이즈가 최대면 맨 위에 껄 뺴고 지금 들어온 수를 입력
                    if (queue.peek() < num) {
                        queue.poll();
                        queue.add(num);
                    }
                }
                else {
                    // 그게 아니라면 큐에 숫자를 입력
                    queue.add(num);
                }
            }
        }

        System.out.println(queue.poll());

    }
}
