package ArraysExercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] people = new int[n];
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            people[i - 1] = countPeople;
            sum += countPeople;
        }
        for (int members:people) {
            System.out.print(members + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
