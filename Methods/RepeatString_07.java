package Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(text, count));
    }

    public static String repeatString(String text, int count){
        String newText = "";
        for (int i = 1; i <= count; i++) {
            newText = newText + text;

        }
        return newText;
    }
}