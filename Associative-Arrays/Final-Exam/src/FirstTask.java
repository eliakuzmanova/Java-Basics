import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String input = scanner.nextLine();

        while(!input.equals("Finish")) {

            String[] tokens = input.split(" ");
            String command = tokens[0];

            if(command.equals("Replace")) {

              message = message.replace(tokens[1], tokens[2]);
                System.out.println(message);

            } else if (command.equals("Cut")) {

                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);

                if((startIndex >= 0 && startIndex < message.length()) && (endIndex >= 0 && endIndex < message.length())) {
                    String firstSub = message.substring(0, startIndex);
                    String endSub = message.substring(endIndex+1);
                    message = firstSub + endSub;
                    System.out.println(message);
                } else {
                    System.out.println("Invalid indices!");
                }

            } else if (command.equals("Make")) {

                if(tokens[1].equals("Upper")){
                    message = message.toUpperCase();
                } else {
                    message = message.toLowerCase();
                }

                System.out.println(message);

            } else if (command.equals("Check")) {

                if (message.contains(tokens[1])){
                    System.out.printf("Message contains %s%n", tokens[1]);
                } else {
                    System.out.printf("Message doesn't contain %s%n", tokens[1]);
                }

            } else if (command.equals("Sum")) {

                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);

                if((startIndex >= 0 && startIndex < message.length()) && (endIndex >= 0 && endIndex < message.length())) {
                    String substring = message.substring(startIndex, endIndex +1);
                    char[] subArr = substring.toCharArray();
                    int sum = 0;
                    for (char ch: subArr) {
                        sum += (int) ch;
                    }

                    System.out.println(sum);
                } else {
                    System.out.println("Invalid indices!");
                }

            }

            input = scanner.nextLine();
        }
    }
}

