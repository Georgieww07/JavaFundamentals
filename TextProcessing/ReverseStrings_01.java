package TextProcessing;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){
            String text = scanner.nextLine();
            if (text.equals("end")){
                break;
            }

            System.out.printf("%s = %s\n", text, returnResult(text));
        }
    }
    public static String returnResult(String text){
        String result = "";
        for (int i = text.length() - 1; i >= 0 ; i--) {
            char currentLetter = text.charAt(i);
            result += currentLetter;
        }
        return result;
    }
}
