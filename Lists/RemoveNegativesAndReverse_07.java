package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        for (int num : numbers) {
            if (num >= 0){
                result.add(num);
            }

        }

        Collections.reverse(result);

        if (result.size() == 0){
            System.out.println("empty");
        }else {
            for (int element : result) {
                System.out.print(element + " ");

            }
        }
    }
}
