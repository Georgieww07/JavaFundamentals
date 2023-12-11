package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class NeedForSpeed_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> carMileage = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> carFuel = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] carInfo = scanner.nextLine().split("\\|");
            String car = carInfo[0];
            int mileage = Integer.parseInt(carInfo[1]);
            int fuel = Integer.parseInt(carInfo[2]);

            if (!carMileage.containsKey(car)){
                carMileage.put(car, mileage);
                carFuel.put(car, fuel);
            }
        }

        while (true){
            String input = scanner.nextLine();
            if (input.equals("Stop")){
                break;
            }


            String[] commandParts = input.split(" : ");
            String command = commandParts[0];
            String car = commandParts[1];

            switch (command){
                case "Drive":
                    int distance = Integer.parseInt(commandParts[2]);
                    int fuel = Integer.parseInt(commandParts[3]);

                    if (carFuel.get(car) < fuel){
                        System.out.println("Not enough fuel to make that ride");
                    }else {
                        carMileage.put(car, carMileage.get(car) + distance);
                        carFuel.put(car, carFuel.get(car) - fuel);

                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", car, distance, fuel);
                    }

                    if (carMileage.get(car) >= 100_000){
                        carMileage.remove(car);
                        carFuel.remove(car);

                        System.out.printf("Time to sell the %s!\n", car);
                    }
                    break;
                case "Refuel":
                    int fuelToUpdate = Integer.parseInt(commandParts[2]);
                    int currentFuel = carFuel.get(car);

                    int requiredFuel = 75 - currentFuel;
                    if (fuelToUpdate > requiredFuel){
                        carFuel.put(car, carFuel.get(car) + requiredFuel);
                        System.out.printf("%s refueled with %d liters\n", car, requiredFuel);
                    }else {
                        carFuel.put(car, carFuel.get(car) + fuelToUpdate);
                        System.out.printf("%s refueled with %d liters\n", car, fuelToUpdate);
                    }

                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(commandParts[2]);
                    carMileage.put(car, carMileage.get(car) - kilometers);



                    if (carMileage.get(car) < 10_000){
                        carMileage.put(car, 10_000);
                    }else {
                        System.out.printf("%s mileage decreased by %d kilometers\n", car, kilometers);
                    }
                    break;
            }
        }

        //"{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."
        carMileage.entrySet().forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n", entry.getKey(), entry.getValue(), carFuel.get(entry.getKey())));
    }
}
