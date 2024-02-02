package 백준.배열;

import java.util.HashSet;
import java.util.Set;

public class 셀프넘버 {
    public static void main(String[] args){
        int  x = 1;
        Set<Integer> dNumber = new HashSet<>();
        dNumber.add(D(1));
        for(int i=1; i<=10000; i++){
            if(!dNumber.contains(i)){
                System.out.println(i);
                dNumber.add(D(i));
            }
            else{
                dNumber.add(D(i));
            }
        }
    }

    public static int D(int n){
        int nextNumber = n;
        while(n>=1){
            int curr = n%10;
            n = n/10;
            nextNumber += curr;
        }
        return nextNumber;
    }
}
