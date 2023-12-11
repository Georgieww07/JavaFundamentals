package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();

        //aaaaabbbbbcdddeeeedssaa -> abcdedsa

        //qqqwerqwecccwd  ->  qwerqwecwd
        char firstSymbol = text.toCharArray()[0];
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) != firstSymbol){
                System.out.print(firstSymbol);
                firstSymbol = text.charAt(i);
            }
        }
        System.out.print(firstSymbol);
    }
}
