import java.util.Scanner;

public class task_1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        if (isValidTriangle(A, B, C)) {
            double perimeter = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimeter);
        } else {
            double area = ((A + B) * C) / 2.0;
            System.out.printf("Area = %.1f\n", area);
        }

        scanner.close();
    }

    private static boolean isValidTriangle(double A, double B, double C) {
        return (A + B > C) && (A + C > B) && (B + C > A);
    }
}