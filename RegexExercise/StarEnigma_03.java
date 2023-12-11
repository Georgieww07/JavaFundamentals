package RegexExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ////@(?<planet>[A-Z][a-z]+)\w*?:(?<population>[0-9]+)!(?<attack>[A|D])!->(?<soldierCount>[0-9]+) -> също работи
        Pattern  pattern = Pattern.compile("@(?<planet>[A-Z][a-z]+)[^@\\-!:>]*:(?<population>[0-9]+)[^@\\-!:>]*!(?<attack>[A|D])![^@\\-!:>]*->(?<soldierCount>[0-9]+)");

        StringBuilder decryptedMessage = new StringBuilder();
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            int count = 0;
            String message = input.toLowerCase();

            for (char element : message.toCharArray()) {
                if (element == 's' || element == 't' || element == 'a' || element == 'r'){
                    count++;
                }
            }

            for (char letter : input.toCharArray()) {
                char currentSymbol = (char)(letter - count);
                decryptedMessage.append(currentSymbol);
            }

            Matcher matcher = pattern.matcher(decryptedMessage);

            if (matcher.find()){
                String planet = matcher.group("planet");
                String attack = matcher.group("attack");

                if (attack.equals("A")){
                    attackedPlanets.add(planet);
                }else if (attack.equals("D")) {
                    destroyedPlanets.add(planet);
                }
                decryptedMessage.delete(0, decryptedMessage.length());
            }
        }



        System.out.printf("Attacked planets: %d\n", attackedPlanets.size());
        Collections.sort(attackedPlanets);
        attackedPlanets.forEach(e -> System.out.printf("-> %s\n", e));

        System.out.printf("Destroyed planets: %d\n", destroyedPlanets.size());
        Collections.sort(destroyedPlanets);
        destroyedPlanets.forEach(e -> System.out.printf("-> %s\n", e));


    }
}
