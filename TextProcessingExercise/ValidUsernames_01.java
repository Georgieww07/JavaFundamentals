package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] usernames = scanner.nextLine().split(", ");


        for (String username : usernames) {
            if (isValid(username)){
                System.out.println(username);
            }

        }
    }
    public static boolean isValid(String username){
        if (username.length() < 3 || username.length() > 16){
            return false;
        }

        char[] currentUser = username.toCharArray();

        for (char symbol : currentUser) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '_' && symbol != '-'){
                return false;
            }
        }
        return true;
    }
}
