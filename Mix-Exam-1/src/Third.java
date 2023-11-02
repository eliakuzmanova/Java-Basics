import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Third {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> phones = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while(!input.equals("End")) {

            String[] commands = input.split(" - ");
            String command = commands[0];
            String phone = commands[1];

            if(command.equals("Add")){
                if(!phones.contains(phone)){
                    phones.add(phone);
                }
            } else if(command.equals("Remove")) {
                phones.remove(phone);
            } else if(command.equals("Bonus phone")) {
               String[] bonusPhones = phone.split(":");
              int index = phones.indexOf(bonusPhones[0]);
              if(index != -1) {
                  phones.add(index + 1, bonusPhones[1]);
              }
            } else if(command.equals("Last")) {

              if(phones.contains(phone)){
                  phones.remove(phone);
                  phones.add(phones.size(), phone);
              }
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", phones));
    }

}
