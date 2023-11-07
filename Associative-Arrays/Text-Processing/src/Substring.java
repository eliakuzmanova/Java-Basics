import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String search = scanner.nextLine();
        String word = scanner.nextLine();
        int index = word.indexOf(search);
        while(index != -1){
              word = word.replace(search, "");
            index = word.indexOf(search);
        }
        System.out.println(word);
    }
}
