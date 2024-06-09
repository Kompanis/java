import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class task_1045 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double[] sides = new double[3];
        sides[0] = scanner.nextDouble();
        sides[1] = scanner.nextDouble();
        sides[2] = scanner.nextDouble();
        scanner.close();

        Arrays.sort(sides);

        double A = sides[2];
        double B = sides[1];
        double C = sides[0];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)) {
                System.out.println("TRIANGULO ISOSCELES");
            }

        }
    }
}