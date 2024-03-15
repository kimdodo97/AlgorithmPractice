package 백준.기초입출력;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10951 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder builder = new StringBuilder();
        while((line = br.readLine())!=null){
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            builder.append(a+b).append("\n");
        }
        System.out.println(builder);
    }
}
