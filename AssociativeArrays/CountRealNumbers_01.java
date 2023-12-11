package AssociativeArrays;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Double> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());


        TreeMap<Double, Integer> counts = new TreeMap<>();

        for (double num : numbers) {
            if (!counts.containsKey(num)){
                counts.put(num, 1);
            }else {
                counts.put(num, counts.get(num) + 1);
            }

        }

        for (Map.Entry<Double, Integer> kvp : counts.entrySet()) {
            System.out.printf("%s -> %d\n",new DecimalFormat("0.####").format(kvp.getKey()), kvp.getValue());

        }
    }
}
