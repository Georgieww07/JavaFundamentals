package Methods;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", printPrice(product, quantity));

    }

    public static double printPrice(String product, int quantity){

        double price = 0;
        if (product.equals("coffee")){
            price = quantity * 1.50;
        }else if (product.equals("water")){
            price = quantity;
        }else if (product.equals("coke")){
            price = quantity * 1.40;
        }else if (product.equals("snacks")){
            price = quantity * 2;
        }
        return price;
    }
}
