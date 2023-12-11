package ObjectsAndAClasses.OrderByAge_06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("End")){
                break;
            }

            String[] personArgs = input.split(" ");
            String name = personArgs[0];
            String identification = personArgs[1];
            int age = Integer.parseInt(personArgs[2]);

            Person person = new Person(name, identification, age);
            people.add(person);
        }

        Collections.sort(people, Comparator.comparingInt(Person::getAge));
        for (Person person : people) {
            System.out.printf("%s with ID: %s is %d years old.\n", person.getName(), person.getIdentification(), person.getAge());
        }
    }
}
