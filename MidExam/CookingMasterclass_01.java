package MidExam;

import java.util.Scanner;

public class CookingMasterclass_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceFlour = Double.parseDouble(scanner.nextLine());
        double priceEgg = Double.parseDouble(scanner.nextLine());
        double priceApron = Double.parseDouble(scanner.nextLine());


        double totalPriceFlour = (students - students / 5) * priceFlour;

        double totalPriceEggs = priceEgg * 10 * students;

        double totalPriceAprons = priceApron * Math.ceil((0.2 * students) + students);


        double finalSum = totalPriceFlour + totalPriceEggs + totalPriceAprons;


        if (finalSum <= budget){
            System.out.printf("Items purchased for %.2f$.", finalSum);
        }else {
            System.out.printf("%.2f$ more needed.", finalSum - budget);
        }


    }
}
