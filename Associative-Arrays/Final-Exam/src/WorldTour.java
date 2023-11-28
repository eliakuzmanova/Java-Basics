import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        String input = scanner.nextLine();

        while(!input.equals("Travel")) {

            String[] tokens = input.split(":");

            String command = tokens[0];
            if(command.equals("Add Stop")) {

                int index = Integer.parseInt(tokens[1]);

                if(index >= 0 && index <= stops.length()) {

                String stop = tokens[2];

                String firstSubString = stops.substring(0,index);
                String secondSubString = stops.substring(index);
                stops = firstSubString + stop + secondSubString;

                 }
                System.out.println(stops);

            } else if (command.equals("Remove Stop")) {

                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);

                if((startIndex >= 0 && startIndex <= stops.length()) && (endIndex >= 0 && endIndex <= stops.length())) {

                    String firstSubString = stops.substring(0, startIndex);
                    String secondSubString = stops.substring(endIndex + 1);
                    stops = firstSubString + secondSubString;

                }

                System.out.println(stops);

            } else if (command.equals("Switch")) {

                String oldString = tokens[1];
                if(stops.contains(oldString)) {


                String newString = tokens[2];

                stops = stops.replace(oldString, newString);

                }
                System.out.println(stops);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }
}
