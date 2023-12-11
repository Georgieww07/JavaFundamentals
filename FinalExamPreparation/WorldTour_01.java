package FinalExamPreparation;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String stops = scanner.nextLine();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Travel")) {
                break;
            }

            String[] commandParts = input.split(":");
            String command = commandParts[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(commandParts[1]);
                    String newText = commandParts[2];
                    if (index >= 0 && index < stops.length()) {
                        String left = stops.substring(0, index);
                        String right = stops.substring(index);

                        stops = left + newText + right;

                    }
                    break;
                case "Remove Stop":
                    int startIdx = Integer.parseInt(commandParts[1]);
                    int endIdx = Integer.parseInt(commandParts[2]);

                    if (startIdx >= 0 && startIdx < stops.length() && endIdx >= 0 && endIdx < stops.length()) {
                        String left = stops.substring(0, startIdx);
                        String right = stops.substring(endIdx + 1);

                        stops = left + right;
                    }
                    break;
                case "Switch":
                    String oldStr = commandParts[1];
                    String newStr = commandParts[2];

                    stops = stops.replace(oldStr, newStr);

                    break;


            }
            System.out.println(stops);
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }
}
