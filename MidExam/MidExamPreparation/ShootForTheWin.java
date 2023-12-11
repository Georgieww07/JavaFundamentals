package MidExam.MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countShot = 0;
        int[] targets = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();
        while (!input.equals("End")){
            int index = Integer.parseInt(input);

            if (isValid(targets, index)){
                int currentTarget = targets[index];
                targets[index] = -1;
                countShot++;

                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] > currentTarget && i != index){
                        targets[i] -= currentTarget;
                    }else if (targets[i] > -1) {
                        targets[i] += currentTarget;
                    }
                    
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", countShot);
        for (int element : targets) {
            System.out.print(element + " ");

        }
    }

    public static boolean isValid (int[] array, int idx){
        return idx >= 0 && idx < array.length;
    }
}
