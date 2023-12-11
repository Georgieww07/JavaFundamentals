package ObjectsAndAClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }

            String[] studentArgs = input.split(" ");
            String firstName = studentArgs[0];
            String lastName = studentArgs[1];
            int age = Integer.parseInt(studentArgs[2]);
            String hometown = studentArgs[3];


            boolean exists = false;
            for (Student student : students) {
                if (student.getFirsName().equals(firstName) && student.getLastName().equals(lastName)){
                    student.setAge(age);
                    student.setHometown(hometown);
                    exists = true;
                    break;
                }

            }

            if (!exists){
                Student student = new Student(firstName, lastName, age, hometown);

                students.add(student);

            }

        }

        String filter = scanner.nextLine();
        for (Student student : students) {
            if (student.getHometown().equals(filter)){
                System.out.println(student.getDetails());
            }

        }
    }
}
