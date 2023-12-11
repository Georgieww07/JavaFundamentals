package Methods;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String input = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if (input.equals("add")){
            System.out.println(add(num1, num2));
        }else if (input.equals("multiply")){
            System.out.println(multiply(num1, num2));
        }else if (input.equals("subtract")){
            System.out.println(subtract(num1, num2));
        }else if (input.equals("divide")){
            System.out.println(divide(num1, num2));
        }

    }
    public static int add(int a, int b){
        return a + b;

    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int divide(int a, int b){
        return a / b;
    }
}
