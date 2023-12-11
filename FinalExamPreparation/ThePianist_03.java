package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> piecesByComposer = new LinkedHashMap<>();
        LinkedHashMap<String, String> piecesByKey = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String piece = input[0];
            String composer = input[1];
            String key = input[2];

            if (!piecesByComposer.containsKey(piece)){
                piecesByComposer.put(piece, composer);
                piecesByKey.put(piece, key);
            }

        }

        while (true){
            String input = scanner.nextLine();
            if (input.equals("Stop")){
                break;
            }
            String[] commandParts = input.split("\\|");
            String command = commandParts[0];

            switch(command){
                case "Add":
                    String piece = commandParts[1];
                    String composer = commandParts[2];
                    String key = commandParts[3];

                    if (!piecesByComposer.containsKey(piece)){
                        piecesByComposer.put(piece, composer);
                        piecesByKey.put(piece, key);

                        System.out.printf("%s by %s in %s added to the collection!\n", piece, composer, key);
                    }else {
                        System.out.printf("%s is already in the collection!\n", piece);
                    }
                    break;
                case "Remove":
                    String pieceToRemove = commandParts[1];
                    if (piecesByComposer.containsKey(pieceToRemove)){
                        piecesByComposer.remove(pieceToRemove);
                        piecesByKey.remove(pieceToRemove);
                        System.out.printf("Successfully removed %s!\n", pieceToRemove);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", pieceToRemove);
                    }
                    break;
                case "ChangeKey":
                    String currentPiece = commandParts[1];
                    String keyToChange = commandParts[2];

                    if (piecesByComposer.containsKey(currentPiece)){
                        piecesByKey.replace(currentPiece, keyToChange);
                        System.out.printf("Changed the key of %s to %s!\n", currentPiece, keyToChange);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", currentPiece);
                    }
                    break;
            }
        }
        //"{Piece} -> Composer: {composer}, Key: {key}"

        for (Map.Entry<String, String> kvp : piecesByComposer.entrySet()) {
            String piece = kvp.getKey();
            String composer = kvp.getValue();
            String key = piecesByKey.get(piece);

            System.out.printf("%s -> Composer: %s, Key: %s\n", piece, composer, key);

        }
    }
}
