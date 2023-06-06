package HomeWork_1;

import java.util.Scanner;

// Реализовать простой калькулятор

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.printf("Введите первое число: ");
        double num1 = sc.nextDouble();
        System.out.printf("Введите второе число: ");
        double num2 = sc.nextDouble();
        System.out.printf("Выберите действие(+ - / *): ");
        String operator = sc.next();
        double result;
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

        System.out.printf("Результат: " + result);
    }
}
