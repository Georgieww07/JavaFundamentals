package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(@|#)(?<firstWord>[A-Za-z]{3,})\\1{2}(?<secondWord>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(text);

        List<String> mirrorWords = new ArrayList<>();

        List<String> allWords = new ArrayList<>();
        while (matcher.find()){
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");

            allWords.add(firstWord);

            String reversedSecond = new StringBuilder(secondWord).reverse().toString();

            if (firstWord.equals(reversedSecond)){
                String result = String.format("%s <=> %s", firstWord, secondWord);
                mirrorWords.add(result);

            }
        }

        if (allWords.size() == 0){
            System.out.println("No word pairs found!");
        }else {
            System.out.printf("%d word pairs found!\n", allWords.size());
        }

        if (mirrorWords.size() == 0){
            System.out.println("No mirror words!");
        }else {
            System.out.println("The mirror words are:");
            System.out.print(String.join(", ", mirrorWords));
        }
    }
}
