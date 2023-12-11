package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int sumAscii = 0;

        for (int i = 1; i <= n; i++) {

            char currentSymbol = scanner.nextLine().charAt(0);
            sumAscii += currentSymbol;

        }
        System.out.printf("The sum equals: %d", sumAscii);
    }
}
