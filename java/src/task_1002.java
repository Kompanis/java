import java.io.IOException;

import java.util.Scanner;

public class task_1002 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();

        double pi = 3.14159;
        double A = pi * R * R;

        System.out.printf("A=%.4f%n", A);

        scanner.close();
    }
}
