package 이코테;

import java.util.ArrayList;

public class DFS구현 {
    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args){
        int[][] values = {
                {},
                {2,3,8},
                {1,7},
                {1,4,5},
                {3,5},
                {3,4},
                {7},
                {2,6,8},
                {1,7}
        };

        for (int[] row : values) {
            ArrayList<Integer> innerList = new ArrayList<Integer>();
            for (int num : row) {
                innerList.add(num);
            }
            graph.add(innerList);
        }

        dfs(1);
    }

    public static void dfs(int x){
        visited[x] = true;
        System.out.println(x + " ");

        for(int i=0; i<graph.get(x).size(); i++){
            int y = graph.get(x).get(i);
            if(!visited[y])
                dfs(y);
        }
    }
}
