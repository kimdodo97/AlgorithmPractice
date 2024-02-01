package 백준.문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 문자열 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String[] results = new String[k];
        List<String> tokens = new ArrayList<>();
        for(int i =0; i<k; i++){
            tokens.add(sc.next());
        }
        sc.close();
        for(String data : tokens){
            System.out.println("" + data.charAt(0) + data.charAt(data.length()-1));
        }
    }
}
