package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        int threshold = 1;

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            threshold *= Integer.parseInt(matcher.group());
        }


        Pattern pattern1 = Pattern.compile("(\\*\\*|::)[A-Z][a-z]{2,}\\1");
        Matcher matcher1 = pattern1.matcher(input);
        List<String> emojis = new ArrayList<>();
        int countEmoji = 0;
        while (matcher1.find()) {
            String emoji = matcher1.group();
            countEmoji++;
            int sumChars = 0;
            for (char letter : emoji.toCharArray()) {
                if (Character.isLetter(letter)){
                    sumChars += letter;
                }
            }

            if (sumChars >= threshold){
                emojis.add(emoji);
            }
        }

        System.out.println("Cool threshold: " + threshold);
        System.out.printf("%d emojis found in the text. The cool ones are:\n", countEmoji);
        emojis.stream().forEach(e -> System.out.println(e));
    }
}
