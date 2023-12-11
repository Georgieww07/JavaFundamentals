package AssociativeArraysExercise;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> plantRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantRating = new LinkedHashMap<>();


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] plantInfo = scanner.nextLine().split("<->");
            String plant = plantInfo[0];
            int rarity = Integer.parseInt(plantInfo[1]);

            plantRarity.put(plant, rarity);
            plantRating.put(plant, new ArrayList<>());
        }


        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Exhibition")) {
                break;
            }
            String currentPlant = input.split(" ")[1];
            if (input.contains("Rate")) {
                double rating = Double.parseDouble(input.split(" ")[3]);

                if (isValid(plantRarity, currentPlant)){
                    plantRating.get(currentPlant).add(rating);
                }else {
                    System.out.println("error");
                }

            } else if (input.contains("Update")) {
                int newRarity = Integer.parseInt(input.split(" ")[3]);

                if (isValid(plantRarity, currentPlant)){
                    plantRarity.put(currentPlant, newRarity);
                }else {
                    System.out.println("error");
                }

            } else if (input.contains("Reset")) {
                if (isValid(plantRarity, currentPlant)){
                   plantRating.get(currentPlant).clear();
                }else {
                    System.out.println("error");
                }

            }
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantRarity.entrySet()) {
            double averageRating = plantRating.get(entry.getKey()).stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", entry.getKey(), entry.getValue(), averageRating);

        }

    }
    public static boolean isValid(Map<String, Integer> plants, String plant){
        if (plants.containsKey(plant)){
            return true;
        }else {
            return false;
        }

    }
}

