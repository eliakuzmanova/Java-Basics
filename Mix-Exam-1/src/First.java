import java.util.Scanner;

public class First {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPD = Double.parseDouble(scanner.nextLine());
        double foodPD = Double.parseDouble(scanner.nextLine());

        double allWater = waterPD * players * days;
        double allFood = foodPD * players * days;

        for (int day = 1; day <= days; day++) {
            double lostEnergy = Double.parseDouble(scanner.nextLine());

            energy -= lostEnergy;
            if(energy <= 0) {
                break;
            }
            if(day % 2 == 0) {
                energy *= 1.05;
                allWater *= 0.70;

            }

            if(day % 3 == 0) {
              allFood -=  allFood / players;
                energy *= 1.10;
            }
        }

        if(energy <= 0) {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", allFood,allWater);
        } else {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        }
    }
}
