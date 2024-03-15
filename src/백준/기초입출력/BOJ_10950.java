package 백준.기초입출력;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        int[] result = new int[count];
        for(int i=0; i<count; i++){
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            result[i] = a+b;
        }

        for(int number : result){
            System.out.println(number);
        }
    }
}
