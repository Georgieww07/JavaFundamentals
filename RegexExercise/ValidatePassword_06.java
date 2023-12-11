package RegexExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Pattern pattern = Pattern.compile("_\\.\\.*([A-Z][A-Za-z0-9]{4,}[A-Z])_\\.\\.*");

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String text = matcher.group(1);
                StringBuilder sb = new StringBuilder();

                for (char element : text.toCharArray()) {
                    if(Character.isDigit(element)){
                        sb.append(element);
                    }
                }
                if (sb.length() == 0){
                    System.out.println("Group: default");
                }else{
                    System.out.printf("Group: %s\n", sb);
                }


            }else {
                System.out.println("Invalid pass!");
            }


        }
    }
}
