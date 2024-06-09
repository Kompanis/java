import java.io.IOException;
import java.util.Scanner;

public class task_1024 {

    public static String encrypt(String input) {
        StringBuilder shifted = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                shifted.append((char) (c + 3));
            } else {
                shifted.append(c);
            }
        }

        shifted.reverse();

        int length = shifted.length();
        for (int i = length / 2; i < length; i++) {
            shifted.setCharAt(i, (char) (shifted.charAt(i) - 1));
        }

        return shifted.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String encryptedLine = encrypt(line);
            System.out.println(encryptedLine);
        }

        scanner.close();
    }
}