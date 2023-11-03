import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] wordsArray = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String word: wordsArray) {
            word = word.toLowerCase();
            if(!wordsMap.containsKey(word)) {
                wordsMap.put(word, 0);
            }
            wordsMap.put(word,wordsMap.get(word) + 1);
        }

        ArrayList<String> oddWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if(entry.getValue() % 2 != 0) {
                oddWords.add(entry.getKey());
            }
        }

            System.out.println(String.join(", ", oddWords));

    }
}
