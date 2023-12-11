package ObjectsAndAClasses.Articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleArgs = scanner.nextLine().split(", ");
        String title = articleArgs[0];
        String content = articleArgs[1];
        String author = articleArgs[2];

        Article article = new Article(title, content, author);


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] commandArgs = scanner.nextLine().split(": ");
            String command = commandArgs[0];
            String commandParameter = commandArgs[1];

            switch (command){
                case "Edit":
                    article.edit(commandParameter);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(commandParameter);
                    break;
                case "Rename":
                    article.rename(commandParameter);
                    break;
            }

        }

        System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
    }
}
