import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());
        String[] input = scanner.nextLine().split(" ");

        while (!String.join(" ", input).equals("Go Shopping!")){

            String command = input[0];
            String item = input[1];

            if(command.equals("Urgent")){
                if(!list.contains(item)) {
                    list.add(0, item);
                }
            } else if(command.equals("Unnecessary")) {
                if(list.contains(item)) {
                  list.remove(item);
                }
            } else if(command.equals("Correct")) {
                String newItem = input[2];
                if(list.contains(item)) {
                   int index = list.indexOf(item);
                   list.set(index, newItem);
                }
            } else if(command.equals("Rearrange")) {
                if(list.contains(item)) {
                    list.remove(item);
                    list.add(list.size()-1, item);
                }
            }

            input =  scanner.nextLine().split(" ");
        }

        System.out.println(String.join(", ", list));

    }
}
