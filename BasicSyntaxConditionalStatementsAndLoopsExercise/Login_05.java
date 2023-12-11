package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0 ; i--) {
            char currentLetter = username.charAt(i);
            password += currentLetter;
        }

        int counter = 0;
        String input = scanner.nextLine();

        while (!input.equals(password)){

            counter++;
            if (counter >= 4){
                System.out.printf("User %s blocked!\n", username);
                return;
            }else {
                System.out.println("Incorrect password. Try again.");
            }

            input = scanner.nextLine();
        }

        System.out.printf("User %s logged in.", username);


    }
}
