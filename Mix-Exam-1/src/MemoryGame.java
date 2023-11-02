import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine().split(" "))
               .collect(Collectors.toList());
        String input = scanner.nextLine();
        int moves = 0;
        while(!input.equals("end")) {
            moves+=1;
            String[] indexes = input.split(" ");
            int firstIndex = Integer.parseInt(indexes[0]);
            int secondIndex = Integer.parseInt(indexes[1]);
         if(firstIndex >= 0 && firstIndex < elements.size() && secondIndex >= 0 && secondIndex < elements.size() && (firstIndex != secondIndex)) {
             String firstEl = elements.get(firstIndex);
             String secondEl = elements.get(secondIndex);
             if(firstEl.equals(secondEl)){
                 System.out.printf("Congrats! You have found matching elements - %s!%n", firstEl);

                if(firstIndex > secondIndex) {
                    elements.remove(firstIndex);
                    elements.remove(secondIndex);
                } else {
                    elements.remove(secondIndex);
                    elements.remove(firstIndex);
                }

                 if(elements.isEmpty()) {
                     break;
                 }
             } else {
                 System.out.println("Try again!");
             }

         } else {
             elements.add(elements.size()/2,"-" + moves+"a");
             elements.add(elements.size()/2,"-" + moves+"a");
             System.out.println("Invalid input! Adding additional elements to the board");
         }

            input = scanner.nextLine();
        }
        if(input.equals("end")) {
            System.out.printf("Sorry you lose :(%n%s",String.join(" ",elements));

        } else {
            System.out.printf("You have won in %d turns!",moves);
        }
    }
}

