import java.util.ArrayList;
import java.util.Scanner;

public class myBig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yours number 1: ");
        String num1Str = scanner.nextLine();
        BigIntegerCustom num1 = new BigIntegerCustom(num1Str);

        System.out.print("Yours number 2: ");
        String num2Str = scanner.nextLine();
        BigIntegerCustom num2 = new BigIntegerCustom(num2Str);

        ArrayList<Integer> additionResult = BigIntegerCustom.addBigInt(num1, num2);
        System.out.println("Addition: " + arrayListToString(additionResult));

        ArrayList<Integer> subtractionResult = BigIntegerCustom.subtractBigInt(num2, num1);
        System.out.println("Subtraction: " + arrayListToString(subtractionResult));

        ArrayList<Integer> multiplicationResult = BigIntegerCustom.multiplyBigInt(num1, num2);
        System.out.println("Multiplication: " + arrayListToString(multiplicationResult));

        ArrayList<Integer> divisionResult = BigIntegerCustom.divideBigInt(num1, num2);
        System.out.println("Division: " + arrayListToString(divisionResult));

        scanner.close();
    }

    private static String arrayListToString(ArrayList<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num);
        }
        return sb.toString();
    }
}
