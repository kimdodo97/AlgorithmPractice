package 백준.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_토마토재배 {
    private static int N;
    private static int M;
    private static int[][] graph;
    private static boolean[][] visited;
    private static int[][] move = {{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        graph = new int[N][M];
        visited = new boolean[N][M];
        Queue<int[]> queue = new LinkedList<>();

        int startX = 0;
        int startY = 0;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<M;j++){
                int curr = Integer.parseInt(st.nextToken());
                if(curr==1){
                    queue.offer(new int[] {i,j});
                    visited[i][j] = true;
                }
                graph[i][j] = curr;
            }
        }


        int max = Integer.MIN_VALUE;

        int count = 0;
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int currX = curr[0];
            int currY = curr[1];
//            if(graph[currX][currY] == -1){
//                continue;
//            }

            for(int i=0; i<move.length; i++){
                int nextX = currX + move[i][0];
                int nextY = currY + move[i][1];
                if((nextX>=0 && nextX<N && nextY>=0 && nextY<M)
                        && graph[nextX][nextY]==0){
                    queue.offer(new int[]{nextX,nextY});
                    graph[nextX][nextY] = graph[currX][currY] + 1;
                }
            }
        }
        if(find_zero(graph)){
            System.out.println(-1);
        }
        else{
            System.out.println(find_max(graph)-1);
        }
    }

    private static int find_max(int[][] arrays){
        int max =0;
        for(int[] array : arrays){
            for(int element : array){
                if(element>max) max=element;
            }
        }
        return max;
    }

    private static boolean find_zero(int[][] arrays){
        for(int[] array : arrays){
            for(int element : array){
                if(element==0) return true;
            }
        }
        return false;
    }
}
