import java.io.IOException;
import java.util.Scanner;

public class task_1009 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double fixedSalary = scanner.nextDouble();
        double totalSales = scanner.nextDouble();

        double finalSalary = fixedSalary + (totalSales * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", finalSalary);

        scanner.close();
    }
}