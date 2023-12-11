package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> cityPopulation = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> cityGold = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Sail")) {
                break;
            }

            String[] info = input.split("\\|\\|");
            String city = info[0];
            int population = Integer.parseInt(info[1]);
            int gold = Integer.parseInt(info[2]);

            if (!cityPopulation.containsKey(city)) {
                cityPopulation.put(city, population);
                cityGold.put(city, gold);
            } else {
                cityPopulation.put(city, cityPopulation.get(city) + population);
                cityGold.put(city, cityGold.get(city) + gold);
            }

        }


        while (true) {
            String text = scanner.nextLine();
            if (text.equals("End")) {
                break;
            }

            String[] eventParts = text.split("=>");
            String event = eventParts[0];
            String town = eventParts[1];

            switch (event) {
                case "Plunder":
                    int people = Integer.parseInt(eventParts[2]);
                    int gold = Integer.parseInt(eventParts[3]);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, gold, people);

                    cityPopulation.put(town, cityPopulation.get(town) - people);
                    cityGold.put(town, cityGold.get(town) - gold);

                    if (cityPopulation.get(town) <= 0 || cityGold.get(town) <= 0) {
                        cityPopulation.remove(town);
                        cityGold.remove(town);

                        System.out.printf("%s has been wiped off the map!\n", town);
                    }

                    break;
                case "Prosper":
                    int additionGold = Integer.parseInt(eventParts[2]);

                    if (additionGold <= 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        cityGold.put(town, cityGold.get(town) + additionGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", additionGold, town, cityGold.get(town));
                    }
                    break;

            }
        }


        if (cityPopulation.size() > 0){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", cityPopulation.size());

            for (Map.Entry<String, Integer> kvp : cityPopulation.entrySet()) {
                //{town1} -> Population: {people} citizens, Gold: {gold} kg
                String town = kvp.getKey();
                int population = kvp.getValue();
                int gold = cityGold.get(town);

                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n", town, population, gold);

            }
        }else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
