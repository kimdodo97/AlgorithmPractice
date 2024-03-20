package 백준.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_그림 {
    private static int N;
    private static int M;
    private static int[][] graph;
    private static boolean[][] visited;
    private static int[][] position = {{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int num=0;
        int max = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M;j++){
                if(graph[i][j]==1 && !visited[i][j]){
                    num++;
                    visited[i][j] = true;
                    int size = bfs(i,j);
                    if(size>max){
                        max = size;
                    }
                }
            }
        }
        System.out.println(num);
        System.out.println(max);
    }

    public static int bfs(int x, int y){
        Queue<int[]> queue  = new LinkedList<>();
        queue.offer(new int[] {x,y});
        visited[x][y] = true;
        int count = 0;
        while(!queue.isEmpty()){
            count++;
            int[] current = queue.poll();
            int currX = current[0];
            int currY = current[1];
            for(int i=0; i<position.length; i++){
                int nextX = currX-position[i][0];
                int nextY = currY -position[i][1];
                if((nextX>=0&&nextX<N && nextY >=0 && nextY<M)
                        && (!visited[nextX][nextY]) && (graph[nextX][nextY] == 1)){
                    visited[nextX][nextY]=true;
                    queue.offer(new int[]{nextX,nextY});
                }
            }
        }
        return count;
    }
}
