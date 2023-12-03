import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n = Integer.parseInt(scanner.nextLine());
    Map<String, Integer> plantsWithRarity = new LinkedHashMap<>();
    Map<String, Integer> plantsWithRating = new LinkedHashMap<>();

    for (int i = 0; i < n; i++) {
        String plantWithRarity = scanner.nextLine();
        String[] tokens = plantWithRarity.split("<->");
        plantsWithRarity.put(tokens[0], Integer.parseInt(tokens[1]));
    }

    String input = scanner.nextLine();

    while (!input.equals("Exhibition")) {
        String[] tokens = input.split(": | - ");
        String command = tokens[0];

        if(command.equals("Rate")) {
            if(plantsWithRarity.containsKey(tokens[1])){
                if(!plantsWithRating.containsKey(tokens[1])) {
                    plantsWithRating.put(tokens[1], Integer.parseInt(tokens[2]));
                } else {
                    plantsWithRating.put(tokens[1], Integer.parseInt(tokens[2]) / 2);
                }
            }
        } else if (command.equals("Update")) {
            
        }

        input = scanner.nextLine();
    }
    }
}
