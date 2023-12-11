package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> firstList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .collect(Collectors.toList());

        List<String> secondList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .collect(Collectors.toList());

        List<String> resultList = new ArrayList<>();


        if (firstList.size() > secondList.size()){
            int start = 0;
            for (int i = 0; i < secondList.size(); i++) {
                String firstNum = firstList.get(i);
                String secondNum = secondList.get(i);

                resultList.add(firstNum);
                resultList.add(secondNum);

                start++;

            }

            for (String element : resultList) {
                System.out.print(element + " ");

            }

            for (int i = start; i < firstList.size(); i++) {
                System.out.print(firstList.get(i) + " ");

            }
        }else {

            int start = 0;
            for (int i = 0; i < firstList.size(); i++) {
                String firstNum = firstList.get(i);
                String secondNum = secondList.get(i);

                resultList.add(firstNum);
                resultList.add(secondNum);

                start++;

            }

            for (String element : resultList) {
                System.out.print(element + " ");

            }

            for (int i = start; i < secondList.size(); i++) {
                System.out.print(secondList.get(i) + " ");

            }

        }
    }
}