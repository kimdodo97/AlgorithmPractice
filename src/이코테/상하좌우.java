package 이코테;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class 상하좌우 {
    private static int n = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); // 첫번째 줄 문자 N 입력받기
        String str = br.readLine();
        String[] plan = str.split(" ");
        System.out.println(Arrays.toString(plan));
        int[] currentPoint = {0,0};
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        for(String move: plan){
            int idx = 0;
            if(move.equals("U"))
                idx = 0;
            else if(move.equals("D"))
                idx = 1;
            else if(move.equals("L"))
                idx = 2;
            else if(move.equals("R"))
                idx = 3;

            int nextX = currentPoint[0] + dx[idx];
            int nextY = currentPoint[1] + dy[idx];

            if(validation(nextX,nextY)){
                currentPoint[0] = nextX;
                currentPoint[1] = nextY;
            }
        }
        currentPoint[0] += 1;
        currentPoint[1] += 1;
        System.out.println(currentPoint[0] + " " +currentPoint[1]);
    }

    public static boolean validation(int x,int y){
        if(x<0||x>=n || y<0 || y>=n){
            return false;
        }
        else{
            return true;
        }
    }
}
