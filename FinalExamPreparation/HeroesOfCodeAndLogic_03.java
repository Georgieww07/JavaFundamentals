package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class HeroesOfCodeAndLogic_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap <String, Integer> heroHitPoints = new LinkedHashMap<>();
        LinkedHashMap <String, Integer> heroManaPoints = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String hero = input[0];
            int hitPoints = Integer.parseInt(input[1]);
            int manaPoints = Integer.parseInt(input[2]);

            if (!heroHitPoints.containsKey(hero)){
                heroHitPoints.put(hero, hitPoints);
                heroManaPoints.put(hero, manaPoints);
            }

        }


        while (true){
            String input = scanner.nextLine();
            if (input.equals("End")){
                break;
            }

            String[] commandParts = input.split(" - ");
            String command = commandParts[0];
            String heroName = commandParts[1];

            switch (command){
                case "CastSpell":
                    int neededManaPoints = Integer.parseInt(commandParts[2]);
                    String spellName = commandParts[3];

                    if (heroManaPoints.get(heroName) >= neededManaPoints){
                        heroManaPoints.put(heroName, heroManaPoints.get(heroName) - neededManaPoints);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroName, spellName, heroManaPoints.get(heroName));
                    }else {
                        System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandParts[2]);
                    String attacker = commandParts[3];

                    heroHitPoints.put(heroName, heroHitPoints.get(heroName) - damage);
                    if (heroHitPoints.get(heroName) > 0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroName, damage, attacker, heroHitPoints.get(heroName));
                    }else {
                        System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                        heroManaPoints.remove(heroName);
                        heroHitPoints.remove(heroName);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(commandParts[2]);
                    int neededRecharge = 200 - heroManaPoints.get(heroName);

                    if (heroManaPoints.get(heroName) + amount > 200){
                        heroManaPoints.put(heroName, 200);
                        System.out.printf("%s recharged for %d MP!\n", heroName, neededRecharge);
                    }else {
                        heroManaPoints.put(heroName, heroManaPoints.get(heroName) + amount);
                        System.out.printf("%s recharged for %d MP!\n", heroName, amount);
                    }
                    break;
                case "Heal":
                    int healAmount = Integer.parseInt(commandParts[2]);
                    int neededHeal = 100 - heroHitPoints.get(heroName);

                    if (heroHitPoints.get(heroName) + healAmount > 100){
                        heroHitPoints.put(heroName, 100);
                        System.out.printf("%s healed for %d HP!\n", heroName, neededHeal);
                    }else {
                        heroHitPoints.put(heroName, heroHitPoints.get(heroName) + healAmount);
                        System.out.printf("%s healed for %d HP!\n", heroName, healAmount);
                    }
                    break;

            }
        }

        heroManaPoints.entrySet().forEach(entry -> {
            System.out.printf("%s\n", entry.getKey());
            System.out.printf("HP: %d\n", heroHitPoints.get(entry.getKey()));
            System.out.printf("MP: %d\n", entry.getValue());
        });
    }
}
