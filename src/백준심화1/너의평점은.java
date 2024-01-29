package 백준심화1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 너의평점은 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        double gradeSum = 0;
        double gradeCnt = 0;
        for(int i=0; i<20; i++){
            String input = sc.nextLine();

            inputList.add(input);
        }

        for(String row : inputList){
            String[] currentDep = row.split(" ");
            if(!currentDep[2].equals("P")){
                double gradeNumber = Double.parseDouble(currentDep[1]);
                gradeCnt += gradeNumber;
                double score = 0.0;
                if(!currentDep[2].equals("P"))
                    score = gradeToNumber(currentDep[2]);
                double currentGradeSum = gradeNumber * score;
                gradeSum += currentGradeSum;
            }
        }
        System.out.println(gradeSum/gradeCnt);
    }

    public static double gradeToNumber(String grade){
        if(grade.equals("A+"))
            return 4.5;
        else if(grade.equals("A0"))
            return 4.0;
        else if(grade.equals("B+"))
            return 3.5;
        else if(grade.equals("B0"))
            return 3.0;
        else if(grade.equals("C+"))
            return 2.5;
        else if(grade.equals("C0"))
            return 2.0;
        else if(grade.equals("D+"))
            return 1.5;
        else if(grade.equals("D0"))
            return 1.0;
        else if(grade.equals("P"))
            return 0.0;
        else
            return 0.0;
    }
}
