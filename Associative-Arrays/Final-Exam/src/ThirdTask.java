import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<String>> guests = new LinkedHashMap<>();
        int unlikedMeals = 0;

        String input = scanner.nextLine();

        while(!input.equals("Stop")) {
            String[] tokens = input.split("-");
            String command = tokens[0];
            String guest = tokens[1];
            String meal = tokens[2];

            if(command.equals("Like")) {
                if(!guests.containsKey(guest)) {
                    guests.put(guest, new ArrayList<String>());
                    guests.get(guest).add(meal);
                } else {
                    if(!guests.get(guest).contains(meal)){
                        guests.get(guest).add(meal);
                    }
                }

            } else {
                if(guests.containsKey(guest)){
                    if(guests.get(guest).contains(meal)) {
                        guests.get(guest).remove(meal);
                        System.out.printf("%s doesn't like the %s.%n", guest, meal);
                        unlikedMeals += 1;
                    } else {
                        System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);
                    }
                } else {
                    System.out.printf("%s is not at the party.%n", guest);
                }

            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : guests.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(),String.join(", ",entry.getValue()));
        }
        System.out.printf("Unliked meals: %d", unlikedMeals);
    }
}
