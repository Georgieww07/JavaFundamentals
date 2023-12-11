package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int sumLitres = 0;


        for (int i = 1; i <= n; i++) {
            int quantity = Integer.parseInt(scanner.nextLine());
            sumLitres += quantity;

            if (sumLitres > 255){
                System.out.println("Insufficient capacity!");
                sumLitres -= quantity;

            }


        }
        System.out.println(sumLitres);
    }
}
