import java.io.IOException;
import java.util.Scanner;

public class task_1036 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double delta = B * B - 4 * A * C;

        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);
        }

        scanner.close();
    }
}
