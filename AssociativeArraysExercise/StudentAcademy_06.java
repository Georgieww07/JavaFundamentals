package AssociativeArraysExercise;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<Double>> grades = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!grades.containsKey(studentName)){
                grades.put(studentName, new ArrayList<>());
                grades.get(studentName).add(grade);
            }else {
                grades.get(studentName).add(grade);
            }
        }

        Map<String, Double> result = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : grades.entrySet()) {
            //double averageGrade = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            double averageGrade = findAverage(entry.getValue());
            if (averageGrade >= 4.50){
                result.put(entry.getKey(), averageGrade);
            }

        }

        result.entrySet().forEach(entry -> System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue()));



    }
    public static double findAverage(List<Double> grades){
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
