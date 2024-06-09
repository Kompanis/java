import java.io.IOException;
import java.util.Scanner;

public class task_1018 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        System.out.println(amount);

        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

        for (int note : banknotes) {
            int count = amount / note;
            System.out.printf("%d nota(s) de R$ %d,00%n", count, note);
            amount %= note;
        }

        scanner.close();
    }
}
