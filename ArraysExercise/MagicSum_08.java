package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int magicNumber = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <= numbers.length - 1; i++) {
            int firstNum = numbers[i];

            for (int current = i + 1; current <= numbers.length - 1 ; current++) {
                int secondNum = numbers[current];

                if (firstNum + secondNum == magicNumber){

                    System.out.print(firstNum + " " + secondNum);
                    System.out.println();
                }


            }
        }
    }
}
