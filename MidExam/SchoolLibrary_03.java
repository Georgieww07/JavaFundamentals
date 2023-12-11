package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> bookshelf = Arrays.stream(scanner.nextLine()
                .split("&"))
                .collect(Collectors.toList());


        while (true){
            String input = scanner.nextLine();
            if (input.equals("Done")){
                break;
            }

            String[] commandArgs = input.split(" \\| ");
            String currentCommand = commandArgs[0];

            switch (currentCommand){
                case "Add Book":
                    String bookToAdd = commandArgs[1];
                    if (!bookshelf.contains(bookToAdd)){
                        bookshelf.add(0, bookToAdd);
                    }
                    break;
                case "Take Book":
                    String bookToTake = commandArgs[1];
                    if (bookshelf.contains(bookToTake)){
                        bookshelf.remove(bookToTake);
                    }
                    break;
                case "Swap Books":
                    String firstBook = commandArgs[1];
                    String secondBook = commandArgs[2];
                    if (bookshelf.contains(firstBook) && bookshelf.contains(secondBook)){
                        int idx1 = bookshelf.indexOf(firstBook);
                        int idx2 = bookshelf.indexOf(secondBook);

                        bookshelf.set(idx1, secondBook);
                        bookshelf.set(idx2, firstBook);
                    }
                    break;
                case "Insert Book":
                    String bookToInsert = commandArgs[1];
                    if (!bookshelf.contains(bookToInsert)){
                        bookshelf.add(bookToInsert);
                    }
                    break;
                case "Check Book":
                    int index = Integer.parseInt(commandArgs[1]);
                    if (index >= 0 && index < bookshelf.size()){
                        System.out.println(bookshelf.get(index));
                    }
                    break;
            }
        }


        System.out.println(String.join(", ", bookshelf));
    }
}
