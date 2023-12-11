package RegexExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userRegex = "(?<user>[a-z0-9]+[\\.\\-_]*?[a-z0-9]+)";
        String hostRegex = "(?<host>[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.?[a-z0-9]+)";
        String finalRegex = userRegex + "@" + hostRegex;

        Pattern pattern = Pattern.compile(finalRegex);
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println(matcher.group("user") + "@" + matcher.group("host"));
        }

    }
}
