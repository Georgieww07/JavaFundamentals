package FinalExamPreparation;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String encryptedMessage = scanner.nextLine();
        StringBuilder decryptedMessage = new StringBuilder(encryptedMessage);

        while (true){
            String input = scanner.nextLine();
            if (input.equals("Decode")){
                break;
            }

            String[] commandParts = input.split("\\|");
            String command = commandParts[0];

            switch (command){
                case "Move":
                    int letters = Integer.parseInt(commandParts[1]);
                    String lettersToMove = decryptedMessage.substring(0, letters);
                    decryptedMessage.delete(0, letters);
                    decryptedMessage.append(lettersToMove);

                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[1]);
                    String value = commandParts[2];
                    decryptedMessage.insert(index, value);

                    break;
                case "ChangeAll":
                    String substring = commandParts[1];
                    String replacement = commandParts[2];

                    decryptedMessage = new StringBuilder(decryptedMessage.toString().replace(substring, replacement));
                    break;
            }
        }
        System.out.printf("The decrypted message is: %s", decryptedMessage);
    }
}
