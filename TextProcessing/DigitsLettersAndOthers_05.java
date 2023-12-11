package TextProcessing;

import java.util.Scanner;

public class DigitsLettersAndOthers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        char[] symbols = input.toCharArray();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (char symbol : symbols) {
            if (Character.isDigit(symbol)){
                digits.append(symbol);

            }else if (Character.isAlphabetic(symbol)){
                letters.append(symbol);
            }else {
                others.append(symbol);
            }

        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
