import java.io.IOException;
import java.util.Scanner;

public class task_1020 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int ageInDays = scanner.nextInt();

        int years = ageInDays / 365;
        int remainingDays = ageInDays % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.printf("%d ano(s)%n", years);
        System.out.printf("%d mes(es)%n", months);
        System.out.printf("%d dia(s)%n", days);

        scanner.close();
    }
}
