package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int currentNum = startNumber; currentNum <= endNumber; currentNum++){

            System.out.print(currentNum + " ");
            sum += currentNum;

        }
        System.out.println();
        System.out.println("Sum: " + sum);

    }
}
