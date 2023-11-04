package Views;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;
    public ConsoleView() {
        scanner = new Scanner(System.in);
    }

    public void CloseScanner() {
        scanner.close();
    }

    public Integer GetAction(String message) {
        System.out.println(message);
        Integer num = scanner.nextInt();
        return num;
    }

    public String InputData(String message) {
        System.out.println(message);
        String result = scanner.next();
        return result;
    }

    public void OutputData(String message) {
        System.out.println(message);
    }

    public List<String> GetCommands(String message) {
        List<String> result = new ArrayList<>();
        System.out.println(message);
        int numberCommand = scanner.nextInt();
        scanner.nextLine();
        if (numberCommand > 0) {
            System.out.println("Введите комманды через пробел:");
            String commandString = scanner.nextLine();
            String[] commandArray = commandString.split(" ");
            for (int i = 0; i < commandArray.length; ++i) {
            result.add(commandArray[i]);
            }
        }
        return result;
    }
}
