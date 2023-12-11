package MidExam.MidExamPreparation;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int totalDays = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalGain = 0;


        for (int day = 1; day <= totalDays; day++) {
            totalGain += dailyPlunder;

            if (day % 3 == 0) {
                double additionalPlunder = 0.5 * dailyPlunder;
                totalGain += additionalPlunder;
            }

            if (day % 5 == 0){
                double loseGain = 0.3 * totalGain;
                totalGain -= loseGain;
            }

        }


        if (totalGain >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.\n", totalGain);
        }else {
            double percentageLeft = (totalGain / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentageLeft);
        }
    }
}
