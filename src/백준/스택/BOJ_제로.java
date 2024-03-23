package 백준.스택;

import java.util.*;
import java.io.*;
public class BOJ_제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        Stack<Integer> stack = new Stack<>();
        int k = Integer.parseInt(br.readLine());
        int number = Integer.parseInt(br.readLine());
        stack.push(number);
        int sum = number;
        for(int i =1; i<k; i++){
            number = Integer.parseInt(br.readLine());
            if(number==0){
                int curr = stack.pop();
                sum -= curr;
            }
            else{
                stack.push(number);
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
