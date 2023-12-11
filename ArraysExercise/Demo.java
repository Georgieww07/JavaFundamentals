package ArraysExercise;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[rows];
        String[] secondArray = new String[rows];


        for (int i = 1; i <= rows; i++) {


            String[] current = scanner.nextLine().split(" ");

            String num1 = current[0];
            String num2 = current[1];



            if (i % 2 == 0){
                secondArray[i - 1] = num1;
                firstArray[i - 1] = num2;

            }else {
                firstArray[i - 1] = num1;
                secondArray[i - 1] = num2;
            }

        }

        for (String elements : firstArray) {

            System.out.print(elements + " ");

        }
        System.out.println();

        for (String elements : secondArray) {

            System.out.print(elements + " ");

        }
    }
}
