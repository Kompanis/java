import java.io.IOException;
import java.util.Scanner;

public class task_1049 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();
        scanner.close();

        String animal = identifyAnimal(word1, word2, word3);
        System.out.println(animal);
    }

    public static String identifyAnimal(String word1, String word2, String word3) {
        if (word1.equals("vertebrado")) {
            if (word2.equals("ave")) {
                if (word3.equals("carnivoro")) {
                    return "aguia";
                } else if (word3.equals("onivoro")) {
                    return "pomba";
                }
            } else if (word2.equals("mamifero")) {
                if (word3.equals("onivoro")) {
                    return "homem";
                } else if (word3.equals("herbivoro")) {
                    return "vaca";
                }
            }
        } else if (word1.equals("invertebrado")) {
            if (word2.equals("inseto")) {
                if (word3.equals("hematofago")) {
                    return "pulga";
                } else if (word3.equals("herbivoro")) {
                    return "lagarta";
                }
            } else if (word2.equals("anelideo")) {
                if (word3.equals("hematofago")) {
                    return "sanguessuga";
                } else if (word3.equals("onivoro")) {
                    return "minhoca";
                }
            }
        }
        return "";
    }
}