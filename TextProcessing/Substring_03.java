package TextProcessing;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String word = scanner.nextLine();
        String text = scanner.nextLine();


        while (true){
            if (!text.contains(word)){
                break;
            }

            text = text.replace(word, "");

        }
        System.out.println(text);
    }
}
