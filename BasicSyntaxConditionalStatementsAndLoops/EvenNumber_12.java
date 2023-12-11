package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class EvenNumber_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        boolean isEvenFound = false;
        while (!isEvenFound){
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0){
                isEvenFound = true;
                System.out.println("The number is: " + Math.abs(number));
            }else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
