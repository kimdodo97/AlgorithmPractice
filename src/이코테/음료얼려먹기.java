package 이코테;
import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class 음료얼려먹기 {
    public static Queue<Integer> queue = new LinkedList<>();
    public static boolean[][] visited;
    public static int N;
    public static int M;
    public static int[][] graph;
    public static void main(String args[]) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());
         graph = new int[N][M];
         for(int i=0; i<N; i++){
             String line = br.readLine();
             String[] row = line.split("");
             int[] inner = new int[M];
             for(int j = 0; j<M; j++){
                 inner[j] = Integer.parseInt(row[j]);
             }
             graph[i] = inner;
         }


         int cnt= 0;
         for(int i=0; i<N; i++){
             for(int j=0; j<M; j++){
                 if(dfs(i,j))
                     cnt++;
             }
         }
         System.out.println(cnt);
     }

     public static boolean dfs(int x, int y){
         if(x <= -1 || x>=N || y<=-1 || y>=M){
             return false;
         }

         if(graph[x][y]== 0){
             graph[x][y] = 1;
             dfs(x,y-1);
             dfs(x,y+1);
             dfs(x-1,y);
             dfs(x+1,y);
             return true;
         }

         return false;
     }
}


