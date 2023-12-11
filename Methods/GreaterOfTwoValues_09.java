package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.equals("int")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println(greaterOfTwo(a, b));

        }else if (input.equals("char")){
            char firstSymbol = scanner.nextLine().charAt(0);
            char secondSymbol = scanner.nextLine().charAt(0);
            System.out.println(greaterOfTwo(firstSymbol, secondSymbol));
        }else if (input.equals("string")){
            String text1 = scanner.nextLine();
            String text2 = scanner.nextLine();
            System.out.println(greaterOfTwo(text1, text2));
        }
    }
    public static int greaterOfTwo(int a, int b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }

    public static char greaterOfTwo(char symbol1, char symbol2){
        if (symbol1 > symbol2){
            return symbol1;
        }else {
            return symbol2;
        }
    }

    public static String greaterOfTwo(String text1, String text2){
        if (text1.compareTo(text2) >= 0){
            return text1;
        }else {
            return text2;
        }
    }
}
