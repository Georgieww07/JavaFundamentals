package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int number = Integer.parseInt(scanner.nextLine());

        int multiplier = 1;
        int result = 0;

        for (int i = 1; i <= 10; i++) {

            result = number * multiplier;
            System.out.printf("%d X %d = %d\n", number, multiplier, result);
            multiplier++;

        }
    }
}
