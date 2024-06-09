import java.io.IOException;
import java.util.Scanner;

public class task_1019 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.printf("%d:%d:%d%n", hours, minutes, remainingSeconds);

        scanner.close();
    }
}
