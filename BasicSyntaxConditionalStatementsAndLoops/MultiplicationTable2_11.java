package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class MultiplicationTable2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());


        int counter = 1;
        while (counter <= 10){

            if (multiplier >= 10){
                System.out.println(number + " X " + multiplier + " = " + number * multiplier);
                return;
            }


            int result = number * multiplier;



            System.out.printf("%d X %d = %d\n", number, multiplier, result);
            counter++;
            multiplier++;
        }



    }
}
