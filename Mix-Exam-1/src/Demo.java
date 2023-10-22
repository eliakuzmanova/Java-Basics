import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    Scanner scanner = new Scanner(System.in);
    List<String> list = Arrays.stream(scanner.nextLine().split("!"))
            .collect(Collectors.toList());
    int[] lift = Arrays
            .stream(scanner.nextLine().split(" "))
            .mapToInt(e -> Integer.parseInt(e)).toArray();
}
