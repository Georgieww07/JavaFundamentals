package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] text = scanner.nextLine().split(" ");
        List<String> result = new ArrayList<>();

        for (String currentText : text) {
            for (int i = 0; i < currentText.length(); i++) {
                result.add(currentText);
            }
        }
        System.out.println(String.join("", result));
    }
}
