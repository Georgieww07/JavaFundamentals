package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= number ; i++) {

            for (int count = 1; count <= i ; count++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}
