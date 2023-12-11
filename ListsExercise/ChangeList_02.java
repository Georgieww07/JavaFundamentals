package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();
        while(!command.equals("end")){
            if (command.contains("Delete")){
                int currentNumber = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(currentNumber));


            }else if (command.contains("Insert")){
                int currentNumber = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);

                numbers.add(index, currentNumber);
            }

            command = scanner.nextLine();
        }

        for (int element : numbers) {
            System.out.print(element + " ");

        }
    }
}
