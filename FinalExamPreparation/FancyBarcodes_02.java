package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("@##*(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@##*");

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String barcode = scanner.nextLine();

            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()){
                String product = matcher.group("barcode");
                StringBuilder group = new StringBuilder();
                for (char element : product.toCharArray()) {
                    if (Character.isDigit(element)){
                        group.append(element);
                    }
                }
                if (group.length() == 0){
                    System.out.println("Product group: 00");
                }else{
                    System.out.printf("Product group: %s\n", group);
                }
            }else {
                System.out.println("Invalid barcode");
            }


        }
    }
}
