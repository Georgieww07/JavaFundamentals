package AssociativeArraysExercise;

import java.util.*;
import java.util.stream.Collectors;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }

            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];


            if (!companyEmployees.containsKey(companyName)) {
                companyEmployees.put(companyName, new ArrayList<>());
                companyEmployees.get(companyName).add(employeeId);
            } else {
                if (!companyEmployees.get(companyName).stream().collect(Collectors.toList()).contains(employeeId)){
                    companyEmployees.get(companyName).add(employeeId);
                }
            }
        }


        for (Map.Entry<String, List<String>> entry : companyEmployees.entrySet()) {
            System.out.println(entry.getKey());
            for (String id : entry.getValue()) {
                System.out.printf("-- %s\n", id);

            }

        }


    }
}

