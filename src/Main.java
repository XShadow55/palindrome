import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {


        Employee[] array = new Employee[10];
        for (int i = 0; i < 10; i++) {
            int dep = random.nextInt(1, 6);
            array[i] = new Employee("name", "Жульнице", "Андреевич", dep, 22000);

        }
        menu(array);
    }

    public static void menu(Employee[] array) {
        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("0 - Зaвершение работы ");
            System.out.println("1 - Получение данных всех сотрудника ");
            System.out.println("2 - Затраты на зарплату за месяц");
            System.out.println("3 - Сотрудник с минимальной зарплатой ");
            System.out.println("4 - Сотрудник с максимальной зарплатой ");
            System.out.println("5 - Среднее значение зарплат ");
            System.out.println("6 - Ф.И.О всех сотрудников ");
            int number = in.nextInt();
            if (number == 0) {
                break;
            }
            if (number == 1) {
                printAll(array);

            }
            if (number == 2) {
                sum(array);

            }
            if (number == 3) {
                minSalary(array);

            }
            if (number == 4) {
                maxSalary(array);
            }
            if (number == 5) {
                srSalary(array);
            }
            if (number == 6) {
                fioAllPeople(array);
            }
        }
    }

    public static void printAll(Employee[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void sum(Employee[] array) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i].getSalary();
        }
        System.out.println(sum);
    }

    public static void minSalary(Employee[] array) {
        int min = array[0].getSalary();
        for (int i = 1; i < array.length; i++) {
            if (min > array[i].getSalary()) {
                min = array[i].getSalary();
            }
        }
        System.out.println(min);
    }

    public static void maxSalary(Employee[] array) {
        int max = array[0].getSalary();
        for (int i = 1; i < array.length; i++) {
            if (max < array[i].getSalary()) {
                max = array[i].getSalary();
            }
        }
        System.out.println(max);
    }

    public static void srSalary(Employee[] array) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i].getSalary();
        }
        System.out.println(sum / (array.length));
    }

    public static void fioAllPeople(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString1());
        }
    }
}
