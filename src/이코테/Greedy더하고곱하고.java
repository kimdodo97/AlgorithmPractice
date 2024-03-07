package 이코테;

import java.util.Scanner;

public class Greedy더하고곱하고 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.next();
        int maxNumber = 0;
        for(String number : numbers.split("")){
            int current = Integer.parseInt(number);
            if(current==1 || current == 0){
                maxNumber += current;
            }
            else{
                maxNumber *= current;
            }
        }
        System.out.println(maxNumber);
    }

    public static void 동빈나답안(){
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.next();
        int result = numbers.charAt(0) - '0';
        for(int i=1; i< numbers.length(); i++){
            int num = numbers.charAt(i) - '0';
            if(num<=1 || result<=1){
                result += num;
            }
            else{
                result *= num;
            }
        }
        System.out.println(result);
    }
}
