package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(=|\\/)(?<place>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(text);

        List<String> destinations = new ArrayList<>();
        while (matcher.find()){
            String place = matcher.group("place");
            destinations.add(place);
        }

        int sum = 0;
        for (String element : destinations) {
            sum += element.length();
        }


        String output = String.join(", ", destinations);
        System.out.printf("Destinations: %s\n", output);
        System.out.printf("Travel Points: %d", sum);
    }
}
