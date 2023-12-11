package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<Character, Integer> countChars = new LinkedHashMap<>();

        String input = scanner.nextLine();
        for (char letter : input.toCharArray()) {
            if (letter == ' '){
               continue;
            }

            if (countChars.containsKey(letter)){
                countChars.put(letter, countChars.get(letter) + 1);
            }else {
                countChars.put(letter, 1);
            }

        }
        countChars.entrySet().forEach(entry -> System.out.printf("%c -> %d\n", entry.getKey(), entry.getValue()));
    }
}
