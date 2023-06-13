package HomeWork_2;

import java.io.FileWriter;
import java.util.Scanner;

// К калькулятору из предыдущего ДЗ добавить логирование.
// 4+2=6
// 6-1=5

public class Task_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.printf("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.printf("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.printf("Выберите действие(+ - / *): ");
        String operator = sc.next();
        int result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Неправильное действие");
                return;

        }
        try (FileWriter writer = new FileWriter("HomeWork_2\\task_4.txt", true)) {
            writer.write(num1 + " " + operator + " " + num2 + " = " + result + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
        System.out.printf("Результат: " + result);
    }
}
