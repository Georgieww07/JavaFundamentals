package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;
        int sumFactorial = 0;

        while (number > 0){

            int lastDigit = number % 10;

            int fact = 1;
            for (int i = 1; i <= lastDigit ; i++) {

                fact *= i;

            }

            sumFactorial += fact;

            number = number / 10;
        }

        if (startNumber == sumFactorial){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
