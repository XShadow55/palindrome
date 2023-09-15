import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] arg) {
        String palindrom = "шалаш";
        char[] masiv = palindrom.toCharArray();
        char[] masiv1 = new char[masiv.length];
        for (int i = masiv.length - 1; i > -1; i--) {
            masiv1[masiv.length - i - 1] = masiv[i];
        }
        String palindrom1 = new String(masiv1);
        if (palindrom.equals(palindrom1)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Обычное слово");
        }
    }
}
