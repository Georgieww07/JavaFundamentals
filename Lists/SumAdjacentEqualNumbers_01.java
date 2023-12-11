package Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Double> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Double.parseDouble(e))
                .collect(Collectors.toList()));





        for (int i = 0; i < numbers.size() - 1; i++) {
            double currentNum = numbers.get(i);
            double numberAfter = numbers.get(i + 1);

            if (currentNum == numberAfter){
                double sum = currentNum + numberAfter;
                numbers.remove(i + 1);
                numbers.set(i, sum);
                i = -1;
            }
        }

        for (double num : numbers) {

            System.out.print(new DecimalFormat("0.###").format(num) + " ");

        }
    }
}
