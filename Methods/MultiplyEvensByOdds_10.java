package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(sumEven(number) * sumOdd(number));
    }

    public static int sumEven(int number){
        int evenSum = 0;
        while (number > 0){
            int currentNum = number % 10;
            if (currentNum % 2 == 0){
                evenSum += currentNum;
            }
            number = number / 10;
        }
        return evenSum;
    }

    public static int sumOdd(int number){
        int oddSum = 0;
        while (number > 0){
            int currentNum = number % 10;
            if (currentNum % 2 != 0){
                oddSum += currentNum;
            }
            number = number / 10;
        }
        return oddSum;
    }
}
