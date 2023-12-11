package MidExam.MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> items = Arrays.stream(scanner.nextLine()
                .split(", "))
                .collect(Collectors
                        .toList());

        while (true){
            String input = scanner.nextLine();
            if (input.equals("Craft!")){
                break;
            }
            String[] commandArgs = input.split(" - ");
            String command = commandArgs[0];
            String currentItem = commandArgs[1];


            switch (command){
                case "Collect":
                    if (!items.contains(currentItem)){
                        items.add(currentItem);
                    }
                    break;

                case "Drop":
                    if (items.contains(currentItem)){
                        items.remove(currentItem);
                    }
                    break;

                case "Combine Items":

                    String oldItem = currentItem.split(":")[0];
                    String newItem = currentItem.split(":")[1];

                    if (items.contains(oldItem)){
                        int indexOldItem = items.indexOf(oldItem);
                        items.add(indexOldItem + 1, newItem);
                    }
                    break;
                case "Renew":
                    if (items.contains(currentItem)){
                        items.remove(currentItem);
                        items.add(currentItem);
                    }
                    break;
            }
        }

        System.out.println(String.join(", ", items));
    }
}
