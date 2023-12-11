package MidExam.MidExamPreparation;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double foodInKg = Double.parseDouble(scanner.nextLine());
        double hayInKg = Double.parseDouble(scanner.nextLine());
        double coverInKg = Double.parseDouble(scanner.nextLine());
        double pigWeightInKg = Double.parseDouble(scanner.nextLine());

        double foodInGr = foodInKg * 1000;
        double hayInGr = hayInKg * 1000;
        double coverInGr = coverInKg * 1000;
        double pigWeightInGr = pigWeightInKg * 1000;

        for (int day = 1; day <= 30; day++) {
            foodInGr -= 300;

            if (day % 2 == 0){
                double neededHay = 0.05 * foodInGr;
                hayInGr -= neededHay;
            }

            if (day % 3 == 0){
                double neededCover = pigWeightInGr / 3;
                coverInGr -= neededCover;
            }


            if (foodInGr <= 0 || hayInGr <= 0 || coverInGr <= 0){
                System.out.println("Merry must go to the pet store!");
                return;
            }

        }

        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodInGr / 1000, hayInGr / 1000, coverInGr / 1000);
    }
}
