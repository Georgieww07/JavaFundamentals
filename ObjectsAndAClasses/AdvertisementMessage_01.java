package ObjectsAndAClasses;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String[] phrases = {
                    "Excellent product.",
                    "Such a great product.",
                    "I always use that product.",
                    "Best product of its category.",
                    "Exceptional product.",
                    "I can’t live without this product."
            };
            int idx1 = random.nextInt(phrases.length);
            String randomPhrase = phrases[idx1];


            String[] events = {
                    "Now I feel good.",
                    "I have succeeded with this product.",
                    "Makes miracles. I am happy of the results!",
                    "I cannot believe but now I feel awesome.",
                    "Try it yourself, I am very satisfied.",
                    "I feel great!"
            };
            int idx2 = random.nextInt(events.length);
            String randomEvent = events[idx2];

            String[] authors = {
                    "Diana",
                    "Petya",
                    "Stella",
                    "Elena",
                    "Katya",
                    "Iva",
                    "Annie",
                    "Eva"
            };
            int idx3 = random.nextInt(authors.length);
            String randomAuthor = authors[idx3];

            String[] cities = {
                    "Burgas",
                    "Sofia",
                    "Plovdiv",
                    "Varna",
                    "Ruse"
            };
            int idx4 = random.nextInt(cities.length);
            String randomCity = cities[idx4];

            System.out.printf("%s %s %s – %s\n", randomPhrase, randomEvent, randomAuthor, randomCity);


        }
    }
}
