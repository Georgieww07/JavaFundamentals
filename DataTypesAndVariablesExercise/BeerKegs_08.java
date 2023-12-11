package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        double biggestKeg = Double.MIN_VALUE;
        String modelBiggestKeg = "";

        for (int i = 1; i <= n; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double kegVolume = Math.PI * radius * radius * height;

            if (kegVolume > biggestKeg){
                biggestKeg = kegVolume;
                modelBiggestKeg = model;
            }

        }
        System.out.println(modelBiggestKeg);
    }
}
