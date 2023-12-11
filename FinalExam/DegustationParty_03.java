package FinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class DegustationParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> likedMeals = new LinkedHashMap<>();
        LinkedHashMap<String, List<String>> dislikedMeals = new LinkedHashMap<>();



        while (true){
            String input = scanner.nextLine();
            if (input.equals("Stop")){
                break;
            }

            String[] commandParts = input.split("-");
            String command = commandParts[0];
            String guest = commandParts[1];
            String meal = commandParts[2];

            switch (command){
                case "Like":
                    if (!likedMeals.containsKey(guest)){
                        likedMeals.put(guest, new ArrayList<>());
                        likedMeals.get(guest).add(meal);
                    }else {
                        if (!likedMeals.get(guest).contains(meal)){
                            likedMeals.get(guest).add(meal);
                        }
                    }
                    break;
                case "Dislike":
                    if (likedMeals.containsKey(guest)) {

                        if (likedMeals.get(guest).contains(meal)){
                            likedMeals.get(guest).remove(meal);
                            System.out.printf("%s doesn't like the %s.\n", guest, meal);
                            dislikedMeals.put(guest, new ArrayList<>());
                            dislikedMeals.get(guest).add(meal);
                        }else {
                            System.out.printf("%s doesn't have the %s in his/her collection.\n", guest, meal);
                        }

                    }else {
                        System.out.printf("%s is not at the party.\n", guest);
                    }
                    break;
            }
        }
        for (Map.Entry<String, List<String>> kvp : likedMeals.entrySet()) {
            //o	"{Guest1}: {meal1}, {meal2} ... {mealN}
            System.out.printf("%s: %s\n", kvp.getKey(), String.join(", ", kvp.getValue().toString()).replace("[", "").replace("]", ""));
        }
        System.out.printf("Unliked meals: %d\n", dislikedMeals.size());
    }
}
