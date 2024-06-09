import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();
        double PI = 3.14159;
        int w = 2;

        double A = PI * Math.pow(R, w);;
        System.out.println("A = " + A);

        scanner.close();
    }
}