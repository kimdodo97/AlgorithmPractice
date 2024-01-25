package 백준심화1;

import java.util.*;
public class 체스기초 {
    public static void main(String[] args) {
        int[] chessSets = {1,1,2,2,2,8};
        String answer = new String();
        Scanner sc = new Scanner(System.in);
        String currentChess = sc.nextLine();

        String[] chesses = currentChess.split(" ");
        for(int i=0; i<chessSets.length; i++){
            answer += Integer.toString(chessSets[i] - Integer.parseInt(chesses[i]));
            answer += " ";
        }
        System.out.println(answer);
    }

    public static int stringToInt(String number){
        return Integer.parseInt(number);
    }
}
