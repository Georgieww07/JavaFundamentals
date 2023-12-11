package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EasterEggs_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(@+|#+)(?<colour>[a-z]{3,})(@+|#+)([^A-Za-z0-9]+)?\\/+(?<amount>[0-9]+)\\/+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            String colour = matcher.group("colour");
            String amount = matcher.group("amount");

            System.out.printf("You found %s %s eggs!\n", amount, colour);
        }
    }
}
