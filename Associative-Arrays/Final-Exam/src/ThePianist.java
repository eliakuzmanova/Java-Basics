import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        Map<String, ArrayList<String>> pieces = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String[] tokens = input.split("\\|");
            String piece = tokens[0];
            String composer = tokens[1];
            String key = tokens[2];
            pieces.put(piece,new ArrayList<String>());
            pieces.get(piece).add(composer);
            pieces.get(piece).add(key);
            input = scanner.nextLine();
        }

        while (!input.equals("Stop")) {
            String[] tokens = input.split("\\|");
            String command = tokens[0];
            if(command.equals("Add")){
                String piece = tokens[1];
                String composer = tokens[2];
                String key = tokens[3];
                if(!pieces.containsKey(piece)){
                    pieces.put(piece,new ArrayList<String>());
                    pieces.get(piece).add(composer);
                    pieces.get(piece).add(key);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                } else {
                    System.out.printf("%s is already in the collection!%n", piece);
                }

            } else if (command.equals("Remove")) {
                String piece = tokens[1];
                if(pieces.containsKey(piece)){
                    pieces.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            } else if (command.equals("ChangeKey")) {
                String piece = tokens[1];
                String key = tokens[2];
                if(pieces.containsKey(piece)) {
                    pieces.get(piece).remove(1);
                    pieces.get(piece).add(key);
                    System.out.printf("Changed the key of %s to %s!%n", piece, key);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : pieces.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }
    }
}
