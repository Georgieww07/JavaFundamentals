package AssociativeArrays;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> allWords = new LinkedHashMap<>();

        String[] words = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(word -> word.toLowerCase())
                .toArray(String[]::new);


        for (String word : words) {
            if (!allWords.containsKey(word)){
                allWords.put(word, 1);
            }else {
                allWords.put(word, allWords.get(word) + 1);
            }
        }

        List<String> result=  new ArrayList<>();
        for (Map.Entry<String, Integer> kvp : allWords.entrySet()) {
            if (kvp.getValue() % 2 != 0){
                result.add(kvp.getKey());
            }
        }

        System.out.println(String.join(", ", result));
    }
}
