package Methods;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (operator){
            case "/":
                division(firstNumber, secondNumber);
                break;
            case "*":
                multiplication(firstNumber, secondNumber);
                break;
            case "+":
                sum(firstNumber, secondNumber);
                break;
            case "-":
                difference(firstNumber, secondNumber);
                break;
        }
    }
    public static void division(int a, int b){
        System.out.println(a / b);
    }
    public static void multiplication(int a, int b){
        System.out.println(a * b);
    }
    public static void sum(int a, int b){
        System.out.println(a + b);
    }
    public static void difference(int a, int b){
        System.out.println(a - b);
    }
}
