package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int start = 1;

        for (int i = 1; i <= input ; i++) {

            System.out.println(start);
            sum += start;
            start += 2;
        }
        System.out.println("Sum: " + sum);

    }
}
