package RegexExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String customerRegex = "%(?<customer>[A-Z][a-z]+)%";
        String productRegex = "<(?<product>\\w+)>";
        String countRegex = "\\|(?<count>[0-9]+)\\|";
        String priceRegex = "(?<price>[0-9]+\\.?[0-9]+)\\$";
        String finalRegex = customerRegex + "[^|$%.]*?" + productRegex + "[^|$%.]*?" + countRegex + "[^|$%.]*?" + priceRegex;

        Pattern pattern = Pattern.compile(finalRegex);
        double sum = 0;

        String input = scanner.nextLine();
        while (!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                double currentPrice = count * price;
                sum += currentPrice;

                System.out.printf("%s: %s - %.2f\n", customer, product, currentPrice);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", sum);
    }
}
