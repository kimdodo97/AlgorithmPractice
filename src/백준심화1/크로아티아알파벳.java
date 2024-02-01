package 백준심화1;

import java.util.Scanner;

public class 크로아티아알파벳 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int cnt = 0;
        while (true) {
            if (input.contains("c=")) {
                input = input.replaceFirst("c=", "");
                cnt++;
            } else if (input.contains("c-")) {
                input = input.replaceFirst("c-", ".");
                cnt++;
            } else if (input.contains("dz=")) {
                input = input.replaceFirst("dz=", ".");
                cnt++;
            } else if (input.contains("d-")) {
                input = input.replaceFirst("d-", ".");
                cnt++;
            } else if (input.contains("lj")) {
                input = input.replaceFirst("lj", ".");
                cnt++;
            } else if (input.contains("nj")) {
                input = input.replaceFirst("nj", ".");
                cnt++;
            } else if (input.contains("s=")) {
                input = input.replaceFirst("s=", ".");
                cnt++;
            } else if (input.contains("z=")) {
                input = input.replaceFirst("z=", ".");
                cnt++;
            } else {
                input = input.replace(".", "");
                cnt += input.length();
                break;
            }
        }
        System.out.println(cnt);
    }
}
