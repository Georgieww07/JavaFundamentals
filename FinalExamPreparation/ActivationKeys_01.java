package FinalExamPreparation;

import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String activationKey = scanner.nextLine();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("Generate")){
                break;
            }

            String[] commandParts = input.split(">>>");
            String command = commandParts[0];

            switch(command){
                case "Contains":
                    String substring = commandParts[1];
                    if (activationKey.contains(substring)){
                        System.out.printf("%s contains %s\n", activationKey, substring);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String type = commandParts[1];
                    int firstIdx = Integer.parseInt(commandParts[2]);
                    int endIdx = Integer.parseInt(commandParts[3]);

                    String extractedText = activationKey.substring(firstIdx, endIdx);
                    activationKey = new StringBuilder(activationKey).delete(firstIdx, endIdx).toString();
                    if (type.equals("Upper")){
                        extractedText = extractedText.toUpperCase();
                        activationKey = new StringBuilder(activationKey).insert(firstIdx, extractedText).toString();

                        System.out.println(activationKey);

                    }else if(type.equals("Lower")){
                        extractedText = extractedText.toLowerCase();
                        activationKey = new StringBuilder(activationKey).insert(firstIdx, extractedText).toString();

                        System.out.println(activationKey);
                    }
                    break;
                case "Slice":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);

                    activationKey = new StringBuilder(activationKey).delete(startIndex, endIndex).toString();
                    System.out.println(activationKey);
                    break;
            }
        }
        System.out.printf("Your activation key is: %s", activationKey);
    }
}
