import java.io.IOException;
import java.util.Scanner;

public class task_1008 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int employeeNumber = scanner.nextInt();
        int hoursWorked = scanner.nextInt();
        double hourlyRate = scanner.nextDouble();

        double salary = hoursWorked * hourlyRate;

        System.out.printf("NUMBER = %d%n", employeeNumber);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        scanner.close();
    }
}