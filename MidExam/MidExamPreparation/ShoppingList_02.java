package MidExam.MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> products = Arrays.stream(scanner.nextLine()
                .split("!"))
                .collect(Collectors
                        .toList());


        while (true){
            String input = scanner.nextLine();
            if (input.equals("Go Shopping!")){
                break;
            }

            String[] commandArgs = input.split(" ");
            String currentCommand = commandArgs[0];
            String product = commandArgs[1];


            switch (currentCommand){
                case "Urgent":
                    if (!products.contains(product)){
                        products.add(0, product);
                    }
                    break;

                case "Unnecessary":
                    products.remove(product);
                    break;

                case "Correct":
                    String newProduct = commandArgs[2];
                    if (products.contains(product)){
                        int oldProductIdx = products.indexOf(product);
                        products.remove(product);
                        products.add(oldProductIdx, newProduct);
                    }
                    break;

                case "Rearrange":
                    if (products.contains(product)){
                        products.remove(product);
                        products.add(product);
                    }
                    break;
            }
        }
        System.out.println(String.join(", ", products));
    }
}
