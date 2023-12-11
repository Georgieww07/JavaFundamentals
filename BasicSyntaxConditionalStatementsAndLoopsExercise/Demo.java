package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= number ; rows++) {

            for (int count = 1; count <= rows ; count++) {
                System.out.print(rows + " ");

            }
            System.out.println();

        }
    }
}
