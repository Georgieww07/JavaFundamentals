package AssociativeArraysExercise;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }

            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!courses.containsKey(courseName)){
                courses.put(courseName, new ArrayList<>());
                courses.get(courseName).add(studentName);
            }else {
                courses.get(courseName).add(studentName);

            }
        }

        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue().size());

            for (String student : entry.getValue()) {
                System.out.printf("-- %s\n", student);
            }


        }
    }
}
