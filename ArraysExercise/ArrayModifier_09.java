package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        String command = scanner.nextLine();
        while (!command.equals("end")){


            if (command.contains("swap")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int number1 = numbers[index1];
                int number2 = numbers[index2];

                numbers[index1] = number2;
                numbers[index2] = number1;

            }else if (command.contains("multiply")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int number1 = numbers[index1];
                int number2 = numbers[index2];
                int result = number1 * number2;

                numbers[index1] = result;

            }else if (command.equals("decrease")){

                for (int i = 0; i <= numbers.length - 1; i++) {
                    numbers[i]--;

                }
            }

            command = scanner.nextLine();
        }

        System.out.println(Arrays.toString(numbers)
                .replace("[", "")
                .replace("]", ""));
    }
}
