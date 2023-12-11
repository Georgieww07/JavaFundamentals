package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int [] firstArray = new int [n];
        int [] secondArray = new int [n];


        for (int i = 1; i <= n; i++) {

            String input = scanner.nextLine();
            int[] current = Arrays.stream(input.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int number1 = current[0];
            int number2 = current[1];

            if (i % 2 == 0){

                secondArray[i - 1] = number1;
                firstArray[i - 1] = number2;

            }else {

                firstArray[i - 1] = number1;
                secondArray[i - 1] = number2;

            }

        }

        for (int elements : firstArray) {

            System.out.print(elements + " ");

        }
        System.out.println();


        for (int elements : secondArray) {

            System.out.print(elements + " ");

        }
    }
}
