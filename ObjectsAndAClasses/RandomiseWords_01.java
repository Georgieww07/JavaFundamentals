package ObjectsAndAClasses;

import java.util.*;
import java.util.stream.Collectors;

public class RandomiseWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random rnd = new Random();

        List<String> words = Arrays.stream(scanner.nextLine()
                .split(" "))
                .collect(Collectors.toList());

        List<String> result = new ArrayList<>();

        int length = words.size();

        for (int i = 0; i < length; i++) {
            int idx = rnd.nextInt(words.size());
            String currentWord = words.get(idx);
            result.add(currentWord);
            words.remove(idx);


        }
        for (String element : result) {
            System.out.println(element);

        }


    }
}
