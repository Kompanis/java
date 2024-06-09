import java.io.IOException;
import java.util.Scanner;

public class task_1016 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();

        int time = distance * 2;

        System.out.println(time + " minutos");

        scanner.close();
    }
}
