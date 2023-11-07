import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder nums = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if(Character.isDigit(character)) {
                nums.append(character);
            } else if (Character.isLetter(character)){
                letters.append(character);
            } else {
                others.append(character);
            }
        }
        System.out.printf("%s%n%s%n%s%n",nums,letters,others);
    }
}
