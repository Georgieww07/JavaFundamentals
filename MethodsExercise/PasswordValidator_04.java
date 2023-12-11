package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String password = scanner.nextLine();


        if (printNotInRange(password) && printOnlyLettersAndDigits(password) && printDigitsMessage(password)) {
            System.out.println("Password is valid");
        }
        if (!printNotInRange(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!printOnlyLettersAndDigits(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!printDigitsMessage(password)){
            System.out.println("Password must have at least 2 digits");
        }


    }

    public static boolean printNotInRange(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean printOnlyLettersAndDigits(String password) {

        boolean isValid = true;
        for (char elements : password.toCharArray()) {
            if (!Character.isLetterOrDigit(elements)) {
                isValid = false;
            }
        }
        return isValid;

    }


    public static boolean printDigitsMessage(String password) {

        boolean isValid = true;
        int count = 0;
        for (char current : password.toCharArray()) {
            if (Character.isDigit(current)) {
                count++;
            }

        }

        if (count < 2) {
            isValid = false;
        }
        return isValid;
    }
}
