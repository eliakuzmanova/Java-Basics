import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([/=])(?<destination>[A-Z]+[A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);

        ArrayList<String> matches = new ArrayList<String>();
        int points = 0;
        int counter = 0;
        while(matcher.find()){

            matches.add(matcher.group("destination"));
            points += matches.get(counter).length();
            counter+=1;
        }

        System.out.println("Destinations: " + String.join(", ", matches));
        System.out.println("Travel Points: "+ points);
    }
}
