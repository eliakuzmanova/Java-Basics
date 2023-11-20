import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String input = scanner.nextLine();

        while(!input.equals("Decode")) {
            String[] token = input.split("\\|");
            String command = token[0];

            if(command.equals("Move")) {
                int number = Integer.parseInt(token[1]);
                String substring = message.substring(0,number);
                message = message.replace(substring, "");
                message += substring;
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(token[1]);
                String value = token[2];
                String firstSub = message.substring(0,index);
                String secondSub = message.substring(index);
                message = firstSub + value + secondSub;

            } else if (command.equals("ChangeAll")) {
                String substring = token[1];
                String replacement = token[2];
                message = message.replace(substring, replacement);
            }


            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", message);


    }
}
