package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();

        printMiddleChar(text);

    }

    public static void printMiddleChar(String text) {

        if (text.length() % 2 != 0) {
            int indexMiddleChar = text.length() / 2;
            System.out.println(text.charAt(indexMiddleChar));
        } else {
            int indexMiddleChar1 = text.length() / 2 - 1;
            int indexMiddleChar2 = text.length() / 2;

            char firstSymbol = text.charAt(indexMiddleChar1);
            char secondSymbol = text.charAt(indexMiddleChar2);

            System.out.print(firstSymbol);
            System.out.print(secondSymbol);
        }
    }
}
