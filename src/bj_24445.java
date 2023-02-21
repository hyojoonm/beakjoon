import java.io.*;
import java.util.*;

public class bj_24445 {
    static int N,M,R,count=1;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] result;
    static boolean[] visited;	//방문 확인 배열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        result = new int[N+1];
        visited = new boolean[N+1];
        for(int i=0;i<=N;i++)
            graph.add(new ArrayList<>());
        for(int i=0;i<M;i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        bfs(R);
        for(int i=1;i<=N;i++)
            bw.write(result[i] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
    //너비 우선 탐색하는 함수
    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();
        result[start] = count++;
        visited[start] = true;
        queue.add(start);
        while(!queue.isEmpty()) {
            int point = queue.poll();
            Collections.sort(graph.get(point),Collections.reverseOrder());
            for(int next : graph.get(point)) {
                if(!visited[next]) {
                    visited[next] = true;
                    result[next] = count++;
                    queue.add(next);
                }
            }
        }
        return;
    }
}
