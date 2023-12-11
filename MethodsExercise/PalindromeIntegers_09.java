package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        while (!input.equals("END")){





            printTrueFalse(input);



           input = scanner.nextLine();
        }
    }


    public static void printTrueFalse(String input){

        String reversedInput = "";
        for (int i = input.length() - 1; i >= 0; i--) {
           reversedInput += input.charAt(i);

        }

        if (input.equals(reversedInput)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }



    }
}
