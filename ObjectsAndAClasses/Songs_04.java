package ObjectsAndAClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Song> songs = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine()); //number of songs
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String songType = input.split("_")[0];
            String name = input.split("_")[1];
            String time = input.split("_")[2];

            Song song = new Song(songType, name, time);
            songs.add(song);

        }

        String filter = scanner.nextLine();
        boolean shouldFilter = !filter.equals("all");

        for (Song song : songs) {
            if (!shouldFilter){
                System.out.println(song.getName());
            }else if (song.getTypeList().equals(filter)){
                System.out.println(song.getName());
            }

        }

    }
}
