package DataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char letter = scanner.nextLine().charAt(0);

        if(letter <= 90){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}
