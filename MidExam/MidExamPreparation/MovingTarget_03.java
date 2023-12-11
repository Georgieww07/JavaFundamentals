package MidExam.MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> targets = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (true) {
            String input = scanner.nextLine();

            if (input.equals("End")) {
                break;
            }
            String[] commands = input.split(" ");
            String currentCommand = commands[0];
            int index = Integer.parseInt(commands[1]);

            switch (currentCommand) {
                case "Shoot":
                    int power = Integer.parseInt(commands[2]);
                    if (isValid(targets, index)) {
                        targets.set(index, targets.get(index) - power);
                        if (targets.get(index) <= 0) {
                            targets.remove(index);
                        }


                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(commands[2]);
                    if (isValid(targets, index)) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }

                    break;
                case "Strike":
                    int radius = Integer.parseInt(commands[2]);
                    int leftIdx = index - radius;
                    int rightIdx = index + radius;

                    if (isValid(targets, leftIdx) && isValid(targets, rightIdx)) {
                        int countRemove = radius * 2 + 1;

                        for (int i = 1; i <= countRemove; i++) {
                            targets.remove(leftIdx);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

        }

        for (int i = 0; i < targets.size() - 1; i++) {
            System.out.print(targets.get(i) + "|");
        }
        System.out.print(targets.get(targets.size() - 1));

    }

    public static boolean isValid(List<Integer> list, int index) {
        if (index >= 0 && index < list.size()) {
            return true;
        } else {
            return false;
        }
    }
}
