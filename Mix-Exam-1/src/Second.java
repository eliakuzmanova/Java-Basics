import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Second {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String stringRoute = scanner.nextLine();
        String[] route = stringRoute.split("\\|\\|");

        int fuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());

        for (String stop: route) {
            if(!stop.equals("Titan")) {

            String[] commands = stop.split(" ");
            String command = commands[0];
            int amount =  Integer.parseInt(commands[1]);

            if(command.equals("Travel")){

                if(fuel < amount) {
                    System.out.println("Mission failed.");
                    break;
                } else {
                    fuel -= amount;
                    System.out.printf("The spaceship travelled %d light-years.%n", amount);
                }

            } else if(command.equals("Enemy")) {

                if(ammunition >= amount) {
                    ammunition-= amount;
                    System.out.printf("An enemy with %d armour is defeated.%n", amount);
                } else {
                    if(amount * 2 <= fuel) {
                        fuel -= amount * 2;
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n", amount);
                    } else {
                        System.out.println("Mission failed.");
                        break;
                    }
                }
            } else if(command.equals("Repair")) {
                fuel += amount;
                ammunition += amount * 2;
                System.out.printf("Ammunitions added: %d.%n", amount*2);
                System.out.printf("Fuel added: %d.%n", amount);
            }

            } else {
                System.out.println("You have reached Titan, all passengers are safe.");

            }
        }
    }
}
