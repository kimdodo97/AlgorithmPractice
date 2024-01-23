import java.util.Scanner;
public class 베라의패션 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(i!=j)
                    answer++;
            }
        }
        System.out.println(answer);
    }
}
