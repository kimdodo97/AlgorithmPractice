package 백준.백준심화1;

import java.util.Scanner;

public class 팰린드롬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.next();

        int mid = words.length() / 2;
        int end = words.length()-1;
        int result = 1;
        for(int i=0; i<mid; i++){
            if(words.charAt(i) != words.charAt(end-i)) {
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}
