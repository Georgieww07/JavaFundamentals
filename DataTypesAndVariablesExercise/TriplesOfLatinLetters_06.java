package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 'a'; i < n + 'a'; i++) {
            for (int j = 'a'; j < n +'a'; j++) {
                for (int k = 'a'; k < n + 'a'; k++) {
                    System.out.printf("%c%c%c", i, j, k);
                    System.out.println();

                }
            }

        }
    }
}
