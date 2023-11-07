import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String word: words) {
         text = text.replace(word, "*".repeat(word.length()));
        }
        System.out.println(text);
    }
}
