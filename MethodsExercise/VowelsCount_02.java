package MethodsExercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine().toLowerCase();

        printVowelsCount(text);
    }

    public static void printVowelsCount(String text) {

        int count = 0;
        for (char current : text.toCharArray()) {

            if (current == 'a' || current =='o' || current == 'e' || current == 'i' || current == 'u')
                count++;
        }
        System.out.println(count);
    }
}
