package 백준심화1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class 단어공부{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        input = input.toLowerCase();
        HashMap<String,Integer> counter= new HashMap<>();

        for(int i=0; i<input.length(); i++){
            String currentChar = Character.toString(input.charAt(i));
            if(counter.containsKey(currentChar)){
                int cnt = counter.get(currentChar);
                counter.put(currentChar,++cnt);
            }
            else{
                counter.put(currentChar,1);
            }
        }

        int Max = 0;
        int[] rank = {0,0};
        String Maxkey ="";
        for(String key : counter.keySet()){
            int currCnt = counter.get(key);
            if(currCnt >= Max) {
                rank[1] = rank[0];
                rank[0] = currCnt;
                Max = currCnt;
                Maxkey = key;
            }
        }
        if(rank[1]==rank[0]){
            System.out.println("?");
        }
        else{
            System.out.println(Maxkey.toUpperCase());
        }
    }
}
