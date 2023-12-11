package ObjectsAndAClasses.Students_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        int studentsCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= studentsCount; i++) {
            String[] studentInfo = scanner.nextLine().split(" ");
            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            double grade = Double.parseDouble(studentInfo[2]);

            Student student = new Student(firstName, lastName, grade);
            students.add(student);

        }

        Collections.sort(students, Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student : students) {
            System.out.printf("%s %s: %.2f\n", student.getFirstName(), student.getLastName(), student.getGrade());

        }
    }
}
