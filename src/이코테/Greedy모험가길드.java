package 이코테;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Greedy모험가길드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 첫번째 줄 문자 N 입력받기
        String str = br.readLine();
        int result = 0;
        int[] members = Arrays.stream(str.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(members);
        System.out.println(Arrays.toString(members));

        int currentCount = 0;
        for(int member : members){
            currentCount += 1;
            if(currentCount >= member){
                result += 1;
                currentCount=0;
            }
        }
        System.out.println(result);
    }
}
