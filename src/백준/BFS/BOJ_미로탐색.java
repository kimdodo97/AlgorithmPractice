package 백준.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_미로탐색 {
    private static int N;
    private static int M;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[][] graph = new int[N][M];
        int[][] visited = new int[N][M];
        Queue<int[]> queue = new LinkedList<>();
        int[][] move = {{0,-1},{0,1},{1,0},{-1,0}};
        int count=0;

        for(int i=0;i<N;i++){
            String line = br.readLine();
            String[] numbers = line.split("");
            for(int j=0;j<M;j++){
                graph[i][j] = Integer.parseInt(numbers[j]);
            }
        }
        int x = 0;
        int y = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(visited[i][j]==0 && graph[i][j]==1){
                    queue.offer(new int[]{i,j});
                    visited[i][j] = 1;
                }
                while(!queue.isEmpty()){
                    int[] curr = queue.poll();
                    x = curr[0];
                    y = curr[1];

                    for(int k=0; k<move.length; k++){
                        int nextX = x + move[k][0];
                        int nextY = y + move[k][1];

                        if(!(nextX<0||nextX>=N||nextY<0||nextY>=M) && (graph[nextX][nextY]==1) && (visited[nextX][nextY]==0)){
                            visited[nextX][nextY] = visited[x][y] + 1;
                            queue.offer(new int[]{nextX, nextY});
                        }
                    }
                }
            }
        }
        System.out.println(visited[N-1][M-1]);
    }
}
