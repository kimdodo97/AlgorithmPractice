package 백준.BFS;

import java.util.*;
import java.io.*;
public class BOJ_순열사이클 {
    private static ArrayList<Integer> graph = new ArrayList<>();
    private static Queue<Integer> queue = new LinkedList<>();
    private static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T =Integer.parseInt(bf.readLine());
        for(int i=0 ;i<T;i++){
            int N = Integer.parseInt(bf.readLine());
            st = new StringTokenizer(bf.readLine());
            graph.add(-1);
            for(int j=0;j<N;j++){
                int number = Integer.parseInt(st.nextToken());
                graph.add(number);
            }
            visited = new boolean[N+1];

            int count = 0;
            for(int j=1; j<=N; j++){
                if(bfs(j)){
                    count++;
                }
            }
            graph = new ArrayList<>();
            System.out.println(count);
        }
    }

    public static boolean bfs(int x){
        int curr =graph.get(x);
        queue.offer(curr);
        visited[curr] = true;
        while(!queue.isEmpty()){
            int next =graph.get(queue.poll());
            //System.out.println(next);
            if(!visited[next]){
                visited[next]= true;
                queue.offer(next);
            }

            if(curr==next){
                return true;
            }
        }
        return false;
    }
}
