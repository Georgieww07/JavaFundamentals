package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        double sumCoins = 0;

        while (!input.equals("Start")){

            double coins = Double.parseDouble(input);

            if (coins == 0.10){
                sumCoins += 0.10;
            }else if (coins == 0.20){
                sumCoins += 0.20;
            }else if (coins == 0.50){
                sumCoins += 0.50;
            }else if (coins == 1){
                sumCoins += 1;
            }else if (coins == 2){
                sumCoins += 2;
            }else {
                System.out.printf("Cannot accept %.2f\n", coins);
            }

            input = scanner.nextLine();
        }


        String product = scanner.nextLine();
        while (!product.equals("End")){


            switch (product){
                case "Nuts":
                    if (sumCoins >= 2){
                        sumCoins -= 2;
                        System.out.printf("Purchased %s\n", product);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sumCoins >= 0.7){
                        sumCoins -= 0.7;
                        System.out.printf("Purchased %s\n", product);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sumCoins >= 1.5){
                        sumCoins -= 1.5;
                        System.out.printf("Purchased %s\n", product);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sumCoins >= 0.8){
                        sumCoins -= 0.8;
                        System.out.printf("Purchased %s\n", product);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sumCoins >= 1){
                        sumCoins -= 1;
                        System.out.printf("Purchased %s\n", product);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sumCoins);

    }
}
