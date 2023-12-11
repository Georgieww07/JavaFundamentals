package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());


        int countHeadset = 0;
        int countMouse = 0;
        int countKeyboard = 0;



        for (int i = 1; i <= lostGamesCount ; i++) {


            if (i % 6 == 0){

                countHeadset++;
                countMouse++;
                countKeyboard++;


            } else if (i % 2 == 0){

                countHeadset++;

            }else if (i % 3 == 0){

                countMouse++;

            }

        }

        int brokenKeyboard = countKeyboard / 2;

        double headsetSum = countHeadset * headsetPrice;
        double mouseSum = countMouse * mousePrice;
        double keyboardSum = countKeyboard * keyboardPrice;
        double displaySum = brokenKeyboard * displayPrice;


        double totalSum = headsetSum + mouseSum + keyboardSum + displaySum;

        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
