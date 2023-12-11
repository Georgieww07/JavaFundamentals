package TextProcessing;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {

            String replacedBannedWord = returnAsteriks(bannedWord);
            text = text.replace(bannedWord, replacedBannedWord);

        }
        System.out.println(text);
    }
    public static String returnAsteriks(String bannedWord){
        char[] result = bannedWord.toCharArray();
        for (int i = 0; i < result.length; i++) {
            result[i] = '*';
        }
        return new String(result);
    }
}
