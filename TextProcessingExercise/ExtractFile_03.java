package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] path = scanner.nextLine().split("\\\\");
        String[] fileParts = path[path.length - 1].split("\\.");

        String name = fileParts[0];
        String extension = fileParts[1];


        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);
    }
}
