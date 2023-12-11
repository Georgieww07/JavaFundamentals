package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        int strength = 0;
        for (int position = 0; position < sb.length(); position++) {
            char currentSymbol = sb.charAt(position);

            if (currentSymbol == '>'){
                int explosion = Integer.parseInt(sb.charAt(position + 1) + "");
                strength += explosion;

            }else if (strength > 0) {
                sb.deleteCharAt(position);
                strength -= 1;
                position -=1;
            }

        }
        System.out.println(sb);


    }
}
