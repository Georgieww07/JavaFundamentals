package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sumEven = 0;

        for (int currentNum : numbers){

            if (currentNum % 2 == 0){
                sumEven += currentNum;
            }
        }

        System.out.println(sumEven);
    }
}
