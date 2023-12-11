package Methods;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double grade = Double.parseDouble(scanner.nextLine());
        printGrades(grade);

    }

    public static void printGrades(double number){


        if (number >= 2 && number <= 2.99){
            System.out.println("Fail");
        }else if (number >= 3 && number <= 3.49){
            System.out.println("Poor");
        }else if (number >= 3.5 && number <= 4.49){
            System.out.println("Good");
        }else if (number >= 4.5 && number <= 5.49){
            System.out.println("Very good");
        }else if (number >= 5.5 && number <= 6){
            System.out.println("Excellent");
        }

    }
}
