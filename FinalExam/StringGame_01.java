package FinalExam;

import java.util.Scanner;

public class StringGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();

        while (true){
            String input = scanner.nextLine();
            if (input.equals("Done")){
                break;
            }

            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            switch (command){
                case "Change":
                    String letter = commandParts[1];
                    String replacement = commandParts[2];

                    text = text.replace(letter, replacement);
                    System.out.println(text);
                    break;
                case "Includes":
                    String substring = commandParts[1];
                    if (text.contains(substring)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String endSubstring = commandParts[1];
                    if (text.endsWith(endSubstring)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    text = text.toUpperCase();
                    System.out.println(text);
                    break;
                case "FindIndex":
                    String element = commandParts[1];
                    int idx = text.indexOf(element);
                    System.out.println(idx);
                    break;
                case "Cut":
                    int startIdx = Integer.parseInt(commandParts[1]);
                    int count = Integer.parseInt(commandParts[2]);

                    text = text.substring(startIdx, startIdx + count);

                    System.out.println(text);

                    break;
            }
        }
    }
}
