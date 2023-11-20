import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("([|#])(?<food>[A-Za-z ]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>[0-9]{1,4})\\1");
        Matcher matcher = pattern.matcher(scanner.nextLine());

        int caloriesForDay = 2000;
        int allCalories = 0;
        String itemsPrint = "";

        while(matcher.find()) {
          String food = matcher.group("food");
          String date = (matcher.group("date"));
          int calories = Integer.parseInt(matcher.group("calories"));
          if(calories > 0 && calories < 10000){
              allCalories += calories;
          }
          itemsPrint += String.format("Item: %s, Best before: %s, Nutrition: %d%n", food, date, calories);
        }

        System.out.printf("You have food to last you for: %.0f days!%n",Math.floor(allCalories / caloriesForDay));
        System.out.println(itemsPrint);

    }
}
