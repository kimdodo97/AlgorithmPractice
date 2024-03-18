package 이코테;

public class 유클리드호제법 {
    public static void main(String[] args){
        int a = 192;
        int b = 162;
        int result = recursive(a,b);
        System.out.println(result);
    }

    public static int recursive(int num1, int num2){
        if(num2==0){
            return num1;
        }
        int r = num1 % num2;
        return recursive(num2,r);
    }
}
