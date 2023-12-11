package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();

        while (true){
            String input = scanner.nextLine();
            if (input.equals("buy")){
                break;
            }

            String name = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            productPrice.put(name, price);

           if (productsQuantity.containsKey(name)){
               productsQuantity.put(name, productsQuantity.get(name) + quantity);
           }else {
               productsQuantity.put(name, quantity);
           }
        }

        for (Map.Entry<String, Double> entry : productPrice.entrySet()) {
            double finalSum = entry.getValue() * productsQuantity.get(entry.getKey());
            System.out.printf("%s -> %.2f\n", entry.getKey(), finalSum);

        }





}}
