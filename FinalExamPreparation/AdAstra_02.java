package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("(\\||#)(?<name>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1");
        Matcher matcher = pattern.matcher(text);

        StringBuilder food = new StringBuilder();

        int sumCalories = 0;

        while (matcher.find()){
            String name = matcher.group("name");
            String expirationDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));

            String result = String.format("Item: %s, Best before: %s, Nutrition: %d\n", name, expirationDate, calories);
            food.append(result);

            sumCalories += calories;
        }
        int days = sumCalories / 2000;

        System.out.printf("You have food to last you for: %d days!\n", days);
        System.out.println(food);
    }
}
