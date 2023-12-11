package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (char symbol : input.toCharArray()) {
            char encrypted = (char)(symbol + 3);
            sb.append(encrypted);
        }
        System.out.println(sb);
    }
}
