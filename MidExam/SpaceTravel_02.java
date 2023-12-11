package MidExam;

import java.util.Scanner;

public class SpaceTravel_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] route = scanner.nextLine().split("\\|\\|");

        int fuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());

        while (fuel > 0) {

            for (int i = 0; i < route.length; i++) {
                String[] commandArgs = route[i].split(" ");
                String currentCommand = commandArgs[0];



                switch (currentCommand) {
                    case "Travel":
                        int lightYears = Integer.parseInt(commandArgs[1]);
                        if (fuel >= lightYears){
                            fuel -= lightYears;
                            System.out.printf("The spaceship travelled %d light-years.\n", lightYears);
                        }else {
                            System.out.println("Mission failed.");
                            return;
                        }
                        break;
                    case "Enemy":
                        int enemyArmour = Integer.parseInt(commandArgs[1]);
                        if (ammunition >= enemyArmour){
                            ammunition -= enemyArmour;

                            System.out.printf("An enemy with %d armour is defeated.\n", enemyArmour);
                        }else {
                            fuel -= enemyArmour * 2;

                            if (fuel > 0){
                                System.out.printf("An enemy with %d armour is outmaneuvered.\n", enemyArmour);
                            }else {
                                System.out.println("Mission failed.");
                                return;
                            }
                        }
                        break;
                    case "Repair":
                        int addition = Integer.parseInt(commandArgs[1]);
                        int ammunitionAddition = addition * 2;
                        fuel += addition;
                        ammunition += ammunitionAddition;

                        System.out.printf("Ammunitions added: %d.\n", ammunitionAddition);
                        System.out.printf("Fuel added: %d.\n", addition);
                        break;
                    case "Titan":
                        System.out.println("You have reached Titan, all passengers are safe.");
                        return;
                }
            }
        }


    }
}
