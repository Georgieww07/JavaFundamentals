package FinalExamPreparation;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String password = scanner.nextLine();
        StringBuilder truePassword = new StringBuilder(password);

        while (true){
            String input = scanner.nextLine();
            if (input.equals("Done")){
                break;
            }

            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            switch(command){
                case "TakeOdd":
                    int passLength = truePassword.length();
                    String currentPassword = truePassword.toString();
                    truePassword.setLength(0);
                    for (int i = 0; i < passLength; i++) {
                        if (i % 2 != 0){
                            char letter = currentPassword.charAt(i);
                            truePassword.append(letter);
                        }
                    }
                    System.out.println(truePassword);

                    break;
                case "Cut":
                    int index = Integer.parseInt(commandParts[1]);
                    int length = Integer.parseInt(commandParts[2]);

                    String cutText = truePassword.substring(index, index + length);
                    truePassword = new StringBuilder(truePassword.toString().replaceFirst(cutText, ""));

                    System.out.println(truePassword);
                    break;
                case "Substitute":
                    String substring = commandParts[1];
                    String substitute = commandParts[2];

                    if (truePassword.toString().contains(substring)){
                        truePassword = new StringBuilder(truePassword.toString().replace(substring, substitute));
                        System.out.println(truePassword);
                    }else {
                        System.out.println("Nothing to replace!");
                    }
                    break;

            }
        }
        System.out.printf("Your password is: %s", truePassword);
    }
}
