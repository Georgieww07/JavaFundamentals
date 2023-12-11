package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //int[] numbers = Arrays.stream(scanner.nextLine()
        // .split(" "))
        // .mapToInt(Integer::parseInt)
        // .toArray();

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        List<Integer> sumNumbers = new ArrayList<>();


        for (int i = 0; i < numbers.length / 2; i++) {
            int leftNum = numbers[i];
            int rightNum = numbers[numbers.length - i - 1];

            int sum = leftNum + rightNum;

            sumNumbers.add(sum);
        }

        for (int element : sumNumbers) {
            System.out.print(element + " ");

        }


        if (numbers.length % 2 != 0){
            System.out.print(numbers[numbers.length / 2]);

        }


    }
}
