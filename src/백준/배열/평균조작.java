package 백준.배열;
import java.util.Arrays;
import java.util.Scanner;
public class 평균조작 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String data = sc.nextLine();
        double[] numbers = Arrays.stream(data.split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Arrays.sort(numbers);
        double maxScore = numbers[n-1];
        double sum = 0;
        for(int i=n-1; i>=0; i--){
            numbers[i] = (numbers[i]/maxScore) * 100;
            sum += numbers[i];
        }
        System.out.println(sum/n);
    }
}
