package FinalExamPreparation;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String message = scanner.nextLine();
        StringBuilder messageResult = new StringBuilder(message);

        while(true){
            String input = scanner.nextLine();
            if (input.equals("Reveal")){
                break;
            }

            String[] commandParts = input.split(":\\|:");
            String command = commandParts[0];

            switch (command){
                case "InsertSpace":
                    int index = Integer.parseInt(commandParts[1]);
                    messageResult.insert(index, " ");
                    System.out.println(messageResult);
                    break;
                case "Reverse":
                    String substring = commandParts[1];
                    if (messageResult.toString().contains(substring)){
                        int idxSubstring = messageResult.indexOf(substring);
                        messageResult.delete(idxSubstring, idxSubstring + substring.length());
                        String reversedSubstring = new StringBuilder(substring).reverse().toString();
                        messageResult.append(reversedSubstring);

                        System.out.println(messageResult);
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String substringToChange = commandParts[1];
                    String replacement = commandParts[2];

                    String changedText = messageResult.toString().replace(substringToChange, replacement);
                    messageResult = new StringBuilder(changedText);

                    System.out.println(messageResult);
                    break;

            }
        }
        System.out.printf("You have a new text message: %s", messageResult);
    }
}
