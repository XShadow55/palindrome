import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int id = 1;
        boolean start = true;
        Employee[] array = new Employee[10];
        for (int i = 0; i < 10; i++) {
            int dep = random.nextInt(1, 6);
            array[i] = new Employee("name", "Жульнице", "Андреевич", dep, 22000, id);
            id += 1;
        }
        while (start) {
            menu();
            int number = in.nextInt();
            if (number == 0){
                return ;
            }
            work(number, array);
        }


    }

    public static void menu() {
        System.out.println("Выберите действие: ");
        System.out.println("0 - Зaвершение работы ");
        System.out.println("1 - Получение данных всех сотрудника ");
        System.out.println("2 - Затраты на зарплату за месяц");
        System.out.println("3 - Сотрудник с минимальной зарплатой ");
        System.out.println("4 - Сотрудник с максимальной зарплатой ");
        System.out.println("5 - Среднее значение зарплат ");
        System.out.println("6 - Ф.И.О всех сотрудников ");


    }

    public static void work(int number, Employee[] array) {

        if (number == 1) {
            System.out.println(Arrays.toString(array));

        }
        if (number == 2) {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum = sum + array[i].getSalary();
            }
            System.out.println(sum);

        }
        if (number == 3) {
            int min = array[0].getSalary();
            for (int i = 1;i<array.length;i++){
                if (min > array[i].getSalary()){
                    min = array[i].getSalary();
                }
            }
            System.out.println(min);

        }
        if (number == 4) {
            int max = array[0].getSalary();
            for (int i = 1; i < array.length; i++) {
                if (max < array[i].getSalary()) {
                    max = array[i].getSalary();
                }
            }
            System.out.println(max);
        }
        if (number == 5) {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum = sum + array[i].getSalary();
            }
            System.out.println(sum/(array.length));
        }
        if (number == 6) {
            for (int i = 0;i< array.length;i++){
                System.out.println(array[i].toString1());
            }
        }



    }
}
