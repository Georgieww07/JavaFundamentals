package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> cars = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            String username = input.split(" ")[1];

            switch (command){
                case "register":
                    String licensePlate = input.split(" ")[2];

                    if (!cars.containsKey(username)){
                        cars.put(username, licensePlate);
                        System.out.printf("%s registered %s successfully\n", username, licensePlate);
                    }else {
                        System.out.printf("ERROR: already registered with plate number %s\n", licensePlate);
                    }
                    break;
                case "unregister":
                    if (!cars.containsKey(username)){
                        System.out.printf("ERROR: user %s not found\n", username);
                    }else {
                        System.out.printf("%s unregistered successfully\n", username);
                        cars.remove(username);
                    }
                    break;
            }

        }

        cars.entrySet().forEach(entry -> System.out.printf("%s => %s\n", entry.getKey(), entry.getValue()));
    }
}
