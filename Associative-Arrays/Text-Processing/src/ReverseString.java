import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while(!input.equals("end")) {
            String reversed = "";
            String[] word = input.split("");
            for (int i = word.length - 1; i >= 0 ; i--) {
                reversed += word[i];
            }
            System.out.printf("%s = %s%n", input, reversed);
            input = scanner.nextLine();
        }
    }
}
