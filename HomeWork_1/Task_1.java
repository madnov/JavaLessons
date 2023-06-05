package HomeWork_1;

import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "cp866");
        System.out.printf("Введите число: ");
        Integer number = scan.nextInt();
        int total = 0;
        for (int i = 0; i <= number; i++) {
            total += i;
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.print("Треугольное число " + number + " равно: ");
        System.out.printf("%s ", total);
        System.out.println("");
        System.out.print("Факториал числа " + number + " равен: ");
        System.out.printf("%s ", factorial);
    }

}
