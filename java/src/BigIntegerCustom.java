import java.util.ArrayList;
import java.util.Collections;

public class BigIntegerCustom {
    private ArrayList<Integer> list;

    public BigIntegerCustom(String d) {
        for (char c : d.toCharArray()) {
            if (Character.isLetter(c)) {
                throw new IllegalArgumentException("Illegal character: " + c);
            }
        }
        d = d.replaceAll(" ", "");
        list = new ArrayList<>();
        for (int i = 0; i < d.length(); i++) {
            list.add(d.charAt(i) - '0');
        }
    }

    public ArrayList<Integer> getList() {
        return this.list;
    }

    public static ArrayList<Integer> addBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        ArrayList<Integer> result = new ArrayList<>();
        int itA = aList.size() - 1;
        int itB = bList.size() - 1;
        int carry = 0;

        while (itA >= 0 || itB >= 0 || carry > 0) {
            int sum = carry;

            if (itA >= 0) {
                sum += aList.get(itA);
                itA--;
            }

            if (itB >= 0) {
                sum += bList.get(itB);
                itB--;
            }

            carry = sum / 10;
            result.add(sum % 10);
        }

        Collections.reverse(result);
        return result;
    }

    public static ArrayList<Integer> subtractBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        ArrayList<Integer> result = new ArrayList<>();
        int itA = aList.size() - 1;
        int itB = bList.size() - 1;
        int borrow = 0;

        while (itA >= 0 || itB >= 0) {
            int diff = (itA >= 0 ? aList.get(itA) : 0) - (itB >= 0 ? bList.get(itB) : 0) - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result.add(diff);
            if (itA >= 0) itA--;
            if (itB >= 0) itB--;
        }

        while (result.size() > 1 && result.get(result.size() - 1) == 0) {
            result.remove(result.size() - 1);
        }

        Collections.reverse(result);
        return result;
    }

    public static ArrayList<Integer> multiplyBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(aList.size() + bList.size(), 0));

        for (int i = aList.size() - 1; i >= 0; i--) {
            int carry = 0;
            for (int j = bList.size() - 1; j >= 0; j--) {
                int sum = aList.get(i) * bList.get(j) + result.get(i + j + 1) + carry;
                carry = sum / 10;
                result.set(i + j + 1, sum % 10);
            }
            result.set(i, result.get(i) + carry);
        }

        while (result.size() > 1 && result.get(0) == 0) {
            result.remove(0);
        }

        return result;
    }

    public static ArrayList<Integer> divideBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        if (b.getList().size() == 1 && b.getList().get(0) == 0) {
            throw new ArithmeticException("Division by zero");
        }

        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();

        for (int digit : aList) {
            current.add(digit);
            int count = 0;
            while (compareTo(current, b.getList()) >= 0) {
                current = subtractBigInt(new BigIntegerCustom(listToString(current)), b);
                count++;
            }
            result.add(count);
        }

        while (result.size() > 1 && result.get(0) == 0) {
            result.remove(0);
        }

        return result;
    }

    private static String listToString(ArrayList<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num);
        }
        return sb.toString();
    }

    private static int compareTo(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (a.size() != b.size()) {
            return a.size() - b.size();
        }

        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i))) {
                return a.get(i) - b.get(i);
            }
        }

        return 0;
    }
}
