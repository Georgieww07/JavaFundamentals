package Arrays;

import java.util.Scanner;

public class ReverseAnArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String[] elements = scanner.nextLine().split(" ");
        String[] reversed = new String[elements.length];


        for (int i = elements.length - 1; i >= 0; i--) {;

            String currentLetter = elements[i];
            reversed[i] = currentLetter;

            System.out.print(reversed[i] + " ");
        }

    }
}
