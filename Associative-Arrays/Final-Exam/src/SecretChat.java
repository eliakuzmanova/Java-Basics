import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {

            String[] tokens = input.split(":\\|:");
            String command = tokens[0];

            if(command.equals("InsertSpace")) {

                message.insert(Integer.parseInt(tokens[1]), " ");
                System.out.println(message);

            } else if (command.equals("Reverse")) {

               int index = message.indexOf(tokens[1]);

               if(index != -1){

                   message.delete(index, index + tokens[1].length());
                   StringBuilder subStr = new StringBuilder(tokens[1]).reverse();
                   message.append(subStr);
                   System.out.println(message);

               } else {

                   System.out.println("error");

               }

            } else if (command.equals("ChangeAll")) {

                String messageString = message.toString();
                messageString = messageString.replace(tokens[1], tokens[2]);
                message = new StringBuilder(messageString);
                System.out.println(message);

            }
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", message);
    }
}
