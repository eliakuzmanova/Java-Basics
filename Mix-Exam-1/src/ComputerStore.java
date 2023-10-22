import java.util.Scanner;

public class ComputerStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double priceWithoutTaxes = 0.0;
        String input = scanner.nextLine();

        while(!input.equals("regular")&&!input.equals("special") ) {
            double price = Double.parseDouble(input);
            if(price <= 0) {
                System.out.println("Invalid price!");
            } else {
                priceWithoutTaxes += price;
            }
            input = scanner.nextLine();
        }

        if(priceWithoutTaxes<= 0) {
            System.out.println("Invalid order!");
        } else {
            double taxes = priceWithoutTaxes * 0.20;
            double price = priceWithoutTaxes + taxes;
            if(input.equals("special")){
                price *= 0.90;
            }
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",price);

        }

    }
}
