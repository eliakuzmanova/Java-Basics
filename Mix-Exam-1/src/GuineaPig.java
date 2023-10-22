import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double food = Double.parseDouble(scanner.nextLine()) * 1000;
        double hay = Double.parseDouble(scanner.nextLine()) * 1000;
        double cover = Double.parseDouble(scanner.nextLine()) * 1000;
        double weight = Double.parseDouble(scanner.nextLine()) * 1000;
        boolean isHappy = true;

        for (int day = 1; day <= 30; day++) {
            food -= 300;
            if(day % 2 == 0) {
                hay -= food * 0.05;
            }
            if(day % 3 == 0) {
                cover -= weight / 3;
            }
            if(food <= 0 || hay <= 0 || cover <= 0) {
                isHappy = false;
                break;
            }
        }

        if(isHappy) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.%n", food/1000, hay/1000, cover/1000);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
