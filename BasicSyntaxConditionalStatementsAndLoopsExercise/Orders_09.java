package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countOrders = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        for (int i = 1; i <= countOrders; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double currentSum = ((days * capsulesCount) * pricePerCapsule);
            totalSum += currentSum;

            System.out.printf("The price for the coffee is: $%.2f\n", currentSum);

        }


        System.out.printf("Total: $%.2f", totalSum);


    }
}
