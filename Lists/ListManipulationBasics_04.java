package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();
        while(!command.equals("end")){

            if (command.contains("Add")){
                int currentNum = Integer.parseInt(command.split(" ")[1]);
                numbers.add(currentNum);


            }else if (command.contains("Remove") && !command.contains("RemoveAt")){
                int currentNum = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(currentNum));


            }else if (command.contains("RemoveAt")){
                int currentIndx = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(currentIndx);


            }else if (command.contains("Insert")){
                int currentNum = Integer.parseInt(command.split(" ")[1]);
                int currentIdx = Integer.parseInt(command.split(" ")[2]);

                numbers.add(currentIdx, currentNum);
            }
            command = scanner.nextLine();
        }

        for (int element : numbers) {
            System.out.print(element + " ");

        }
    }
}
