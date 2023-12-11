package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")){

            if (command.contains("Add")){
                int currentNum = Integer.parseInt(command.split(" ")[1]);
                numbers.add(currentNum);

            }else if (command.contains("Insert")){
                int currentNum = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);

                if (index >= 0 && index < numbers.size()){
                    numbers.add(index, currentNum);
                }else {
                    System.out.println("Invalid index");
                }

            }else if (command.contains("Remove")){
                int index = Integer.parseInt(command.split(" ")[1]);
                if (index >= 0 && index < numbers.size()){
                    numbers.remove(index);
                }else {
                    System.out.println("Invalid index");
                }

            }else if (command.contains("Shift left")){
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    int number = numbers.get(0);
                    numbers.add(number);
                    numbers.remove(0);

                }

            }else if (command.contains("Shift right")){
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    int number = numbers.get(numbers.size() - 1);
                    numbers.add(0, number);
                    numbers.remove(numbers.size() - 1);
                }
            }
            command = scanner.nextLine();
        }

        for (int element : numbers) {
            System.out.print(element + " ");

        }
    }
}
