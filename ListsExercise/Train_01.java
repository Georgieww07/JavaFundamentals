package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());


        String command = scanner.nextLine();
        while (!command.equals("end")){

            if (command.contains("Add")){
                int passengers = Integer.parseInt(command.split(" ")[1]);
                wagons.add(passengers);
            }else {
                int passengers = Integer.parseInt(command);
                for (int i = 0; i < wagons.size(); i++) {
                    int currentPassengers = wagons.get(i);

                    if (passengers + currentPassengers <= maxCapacity){
                        wagons.set(i, passengers + currentPassengers);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int element : wagons) {
            System.out.print(element + " ");

        }
    }
}
