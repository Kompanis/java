import java.io.IOException;
import java.util.Scanner;

public class task_1013 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int greatest = a;
        if (b > greatest) {
            greatest = b;
        }
        if (c > greatest) {
            greatest = c;
        }

        System.out.println(greatest + " eh o maior");

        scanner.close();
    }
}
