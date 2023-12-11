package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //P34562Z q2576f   H456z
        String[] input = scanner.nextLine().split("\\s+");

        double sum = 0;
        for (String text : input) {
            char[] textArgs = text.toCharArray();

            char leftLetter = textArgs[0];
            char rightLetter = textArgs[textArgs.length - 1];
            double number = Double.parseDouble(text.replace(leftLetter, ' ').replace(rightLetter, ' ').trim());



            if (Character.isUpperCase(leftLetter)){
                int leftLetterPosition = leftLetter - 64;
                sum += number / leftLetterPosition;
            }else if(Character.isLowerCase(leftLetter)){
                int leftLetterPosition = leftLetter - 96;
                sum += number * leftLetterPosition;
            }



            if (Character.isUpperCase(rightLetter)){
                int rightLetterPosition = rightLetter - 64;
                sum -= rightLetterPosition;
            }else if(Character.isLowerCase(rightLetter)){
                int rightLetterPosition = rightLetter - 96;
                sum += rightLetterPosition;
            }

        }
        System.out.printf("%.2f", sum);
    }
}
