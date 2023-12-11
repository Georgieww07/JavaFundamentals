package Arrays;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int day = Integer.parseInt(scanner.nextLine());

        String[] weekDays = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        if (day > 0 && day <= weekDays.length){

            System.out.println(weekDays[day - 1]);

        }else {

            System.out.println("Invalid day!");

        }
    }
}
