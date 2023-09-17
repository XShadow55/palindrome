import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] arg) {
        String palindrom = "шалаш";
        StringBuilder mas = new StringBuilder(palindrom);
        mas.reverse();
        String palindrom1 = mas.toString();
        if (palindrom.equals(palindrom1)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Обычное слово");
        }
    }
}
