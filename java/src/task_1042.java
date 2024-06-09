import java.util.Arrays;
import java.util.Scanner;

public class task_1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] originalNumbers = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println();

        for (int number : originalNumbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}