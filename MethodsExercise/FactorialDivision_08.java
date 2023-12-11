package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        long factFirstNumber = printFactorial(number1);
        long factSecondNumber = printFactorial(number2);

        double division = factFirstNumber * 1.0 / factSecondNumber;
        System.out.printf("%.2f", division);

    }
    public static long printFactorial(int number){

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;

        }
        return factorial;

    }
}

