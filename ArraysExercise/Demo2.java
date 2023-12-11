package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int[] temp = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            temp[i] = numbers[i];
        }

        for (int i = 0; i <= numbers.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j <= numbers.length - 1; j++) {

                if (numbers[i] > temp[j]) {
                    count++;

                }else {
                    break;
                }

            }
        }
        System.out.print(numbers[numbers.length - 1]);
    }
}
