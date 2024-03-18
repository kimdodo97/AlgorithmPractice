package 이코테;

public class 팩토리얼 {
    public static void main(String[] args){
        int num = 5;
        int result = recursive_factorial(num);
        System.out.println(result);
    }

    public static int recursive_factorial(int num){
        if(num<=1){
            return 1;
        }
        return num * recursive_factorial(num-1);
    }
}
