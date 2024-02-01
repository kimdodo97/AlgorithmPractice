package 백준.문자열;

import java.util.Scanner;

public class 문자와문자열 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputString= sc.next();
        int k = sc.nextInt();

        System.out.println(inputString.charAt(k-1));
    }
}
