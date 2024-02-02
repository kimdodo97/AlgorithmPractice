package 백준.배열;

import java.util.Scanner;
import java.util.Arrays;
public class X보다작은수 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String axInput = sc.nextLine();
        int[] nx = Arrays.stream(axInput.split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int N = nx[0];
        int X = nx[1];

        String data = sc.nextLine();
        int[] arr = Arrays.stream(data.split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for(int number : arr){
            if(number<X){
                System.out.print("" + number +" ");
            }
        }
    }
}
