package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");
        String firstText = input[0];
        String secondText = input[1];



        printResult(firstText, secondText);


    }
    public static void printResult(String firstText, String secondText){
        int biggerString = Math.max(firstText.length(), secondText.length());
        int smallerString = Math.min(firstText.length(), secondText.length());

        double sum = 0;

        //love
        //SoftUni

        //Petar
        //Georgi
        for (int i = 0; i < smallerString; i++) {
            sum += firstText.charAt(i) * secondText.charAt(i);
        }

        if (firstText.length() > secondText.length()){
            for (int i = smallerString; i < biggerString; i++) {
                sum += firstText.charAt(i);

            }
        }else if (secondText.length() > firstText.length()){
            for (int i = smallerString; i < biggerString; i++) {
                sum += secondText.charAt(i);

            }
        }
        System.out.printf("%.0f", sum);
    }
}
