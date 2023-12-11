package MidExam.MidExamPreparation;

import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int health = 100;
        int bitcoins = 0;
        boolean isAlive = true;
        String[] rooms = scanner.nextLine().split("\\|");
        for (int i = 0; i < rooms.length; i++) {
            String currentCommand = rooms[i];
            String command = currentCommand.split(" ")[0];


            switch (command){
                case "potion":
                    int heal = Integer.parseInt(currentCommand.split(" ")[1]);
                    int healthAfterHeal = Math.min(health + heal, 100);

                    System.out.printf("You healed for %d hp.\n", healthAfterHeal - health);
                    health = healthAfterHeal;
                    System.out.printf("Current health: %d hp.\n", healthAfterHeal);

                    break;
                case "chest":
                    int currentBits = Integer.parseInt(currentCommand.split(" ")[1]);
                    bitcoins += currentBits;
                    System.out.printf("You found %d bitcoins.\n", currentBits);

                    break;
                default:
                    int attack = Integer.parseInt(currentCommand.split(" ")[1]);
                    health -= attack;

                    if (health > 0){
                        System.out.printf("You slayed %s.\n", command);
                    }else {
                        System.out.printf("You died! Killed by %s.\n", command);
                        System.out.printf("Best room: %d\n", i + 1);
                        isAlive = false;

                    }
                    break;
            }
            if (!isAlive){
                break;
            }
        }

        if (isAlive){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d\n", bitcoins);
            System.out.printf("Health: %d", health);
        }
    }
}
