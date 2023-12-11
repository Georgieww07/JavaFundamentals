package ObjectsAndAClasses.VehicleCatalogue_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();

        int sumHorsepowerCars = 0;
        int countCars = 0;

        int sumHorsePowerTrucks = 0;
        int countTrucks = 0;


        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }

            String[] vehicleParts = input.split(" ");
            String typeOfVehicle = vehicleParts[0];
            if (typeOfVehicle.equals("car")){
                typeOfVehicle = "Car";
            }else {
                typeOfVehicle = "Truck";
            }
            String model = vehicleParts[1];
            String colour = vehicleParts[2];
            int horsepower = Integer.parseInt(vehicleParts[3]);

            Vehicle vehicle = new Vehicle(typeOfVehicle, model, colour, horsepower);
            vehicles.add(vehicle);

            if (vehicle.getTypeOfVehicle().equals("Car")) {
                sumHorsepowerCars += vehicle.getHorsepower();
                countCars++;
            }

            if (vehicle.getTypeOfVehicle().equals("Truck")) {
                    sumHorsePowerTrucks += vehicle.getHorsepower();
                    countTrucks++;
                }

        }

        while (true) {
            String modelInput = scanner.nextLine();
            if (modelInput.equals("Close the Catalogue")) {
                break;
            }

            for (Vehicle vehicle : vehicles) {
                if (modelInput.equals(vehicle.getModel())) {
                    System.out.printf("Type: %s\n", vehicle.getTypeOfVehicle());
                    System.out.printf("Model: %s\n", vehicle.getModel());
                    System.out.printf("Color: %s\n", vehicle.getColour());
                    System.out.printf("Horsepower: %s\n", vehicle.getHorsepower());
                }
            }
        }

        if (countCars > 0) {
            double averageCarsHorsepower = sumHorsepowerCars * 1.0 / countCars;
            System.out.printf("Cars have average horsepower of: %.2f.\n", averageCarsHorsepower);
        }else {
            System.out.println("Cars have average horsepower of: 0.00.");
        }

        if (countTrucks > 0) {
            double averageTrucksHorsepower = sumHorsePowerTrucks * 1.0 / countTrucks;
            System.out.printf("Trucks have average horsepower of: %.2f.\n", averageTrucksHorsepower);
        }else {
            System.out.println("Trucks have average horsepower of: 0.00.");
        }
    }
}

