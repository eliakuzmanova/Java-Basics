import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("\\|(?<name>[A-Z]{4,})\\|:#(?<title>[A-Za-z]+ [A-Za-z]+)#");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()) {
                String boss = matcher.group("name");
                String title = matcher.group("title");
                System.out.printf("%s, The %s%n", boss, title);
                System.out.printf(">> Strength: %d%n", boss.length());
                System.out.printf(">> Armor: %d%n", title.length());
            } else {
                System.out.println("Access denied!");
            }
        }


    }
}
