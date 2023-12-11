package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());



        String command = scanner.nextLine();
        while (!command.equals("end")){

            if (command.contains("Contains")){
                int currentNum = Integer.parseInt(command.split(" ")[1]);
                int count = 0;
                for (int element : numbers) {
                    if (element == currentNum) {
                        count++;
                    }
                }
                if (count > 0){
                    System.out.println("Yes");
                }else {
                    System.out.println("No such number");
                }

            }else if (command.equals("Print even")){
                for (int element : numbers) {
                    if (element % 2 == 0){
                        System.out.print(element + " ");
                    }
                }
                System.out.println();

            }else if (command.equals("Print odd")){
                for (int element : numbers) {
                    if (element % 2 != 0){
                        System.out.print(element + " ");
                    }
                }
                System.out.println();

            }else if (command.equals("Get sum")){
                int sum = 0;
                for (int elements : numbers) {
                    sum += elements;
                }
                System.out.println(sum);

            }else if (command.contains("Filter")){
                String condition = command.split(" ")[1];
                int specialNum = Integer.parseInt(command.split(" ")[2]);
                switch (condition){
                    case "<":
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) < specialNum){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                        break;

                    case ">":
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) > specialNum){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                        break;

                    case ">=":
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) >= specialNum){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();

                        break;
                    case "<=":
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) <= specialNum){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();

                        break;
                }
            }
            command = scanner.nextLine();
        }
    }
}
