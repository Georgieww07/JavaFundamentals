package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int originPokePower = pokePower;

        int count = 0;

        while (pokePower >= distance){

            pokePower -= distance;
            count++;

            if (pokePower == originPokePower / 2 && exhaustionFactor != 0){

                pokePower /= exhaustionFactor;
            }

        }

        System.out.println(pokePower);
        System.out.println(count);
    }
}
