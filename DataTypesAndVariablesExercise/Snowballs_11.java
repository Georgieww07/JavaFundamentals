package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        double highestValue = Double.MIN_VALUE;

        int totalSnow = 0;
        int totalTime = 0;
        int totalQuality = 0;

        for (int i = 1; i <= n; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((int)(snowballSnow / snowballTime), snowballQuality);


            if (snowballValue > highestValue){

                highestValue = snowballValue;
                totalSnow = snowballSnow;
                totalTime = snowballTime;
                totalQuality = snowballQuality;

            }
        }

        System.out.printf("%d : %d = %.0f (%d)", totalSnow, totalTime, highestValue, totalQuality);

    }
}
