package ArraysExercise;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] array = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= rotations; i++) {

            String firstNum = array[0];

            for (int index = 0; index < array.length - 1; index++) {

                array[index] = array[index + 1];
            }
            array[array.length - 1] = firstNum;

        }

        for (String e : array) {

            System.out.print(e + " ");

        }
    }
}
