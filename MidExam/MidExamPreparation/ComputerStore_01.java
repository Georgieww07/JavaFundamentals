package MidExam.MidExamPreparation;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double totalPrice = 0;
        double resultMultiplier = 0;


        while (true) {
            String input = scanner.nextLine();
            if (input.equals("special")) {
                resultMultiplier = 0.9;
                break;
            } else if (input.equals("regular")) {
                resultMultiplier = 1;
                break;
            }

            double currentPrice = Double.parseDouble(input);
            if (currentPrice > 0) {
                totalPrice += currentPrice;
            } else {
                System.out.println("Invalid price!");
            }

        }

        if (totalPrice == 0){
            System.out.println("Invalid order!");
        }else {
            double taxes = 0.2 * totalPrice;
            double finalSum = (totalPrice + taxes) * resultMultiplier;

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$\n", totalPrice);
            System.out.printf("Taxes: %.2f$\n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", finalSum);
        }

    }
}
