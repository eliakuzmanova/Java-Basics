import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TheLift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < lift.length; i++) {

            if(lift[i] == 0) {
                if(people <4) {
                    lift[i] += people;
                    people-= people;
                }else {
                    people-=4;
                    lift[i]+=4;
                }

            } else if(lift[i] == 1) {
                if(people <3) {
                    lift[i] += people;
                    people-= people;
                }else {
                    people-=3;
                    lift[i]+=3;
                }

            } else if(lift[i] == 2) {
                if(people<2) {
                    lift[i] += people;
                    people-= people;
                }else {
                    people-=2;
                    lift[i] +=2;
                }
            } else if(lift[i] == 3) {
                if(people>=1) {
                    people-=1;
                    lift[i] +=1;
                }
            }
        }
        String[] liftAsStringArr = Arrays.stream(lift)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        boolean isFull = !IntStream.of(lift).anyMatch(n -> n == 3 || n == 2 || n == 1);
            if(!isFull) {
                System.out.println("The lift has empty spots!");
            } else if(isFull && people > 0) {
                System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            }

        System.out.println(String.join(" ", liftAsStringArr));
    }
}
