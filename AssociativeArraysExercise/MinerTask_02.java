package AssociativeArraysExercise;

import java.util.*;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        while (true){
            String input = scanner.nextLine();
            if (input.equals("stop")){
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());


            if (resources.containsKey(input)){
                resources.put(input, resources.get(input) + quantity);
            }else {
                resources.put(input, quantity);
            }
        }
        resources.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));
    }
}
