import java.util.Scanner;

public class task_1038 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productCode = scanner.nextInt();
        int quantity = scanner.nextInt();

        scanner.close();

        double price = switch (productCode) {
            case 1 -> 4.00;
            case 2 -> 4.50;
            case 3 -> 5.00;
            case 4 -> 2.00;
            case 5 -> 1.50;
            default -> 0;
        };

        double total = price * quantity;

        System.out.printf("Total: R$ %.2f\n", total);
    }
}