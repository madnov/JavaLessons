package HomeWork_4;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном
 * порядке и каждый из их узлов содержит одну цифру.
 * 1) Умножьте два числа и верните произведение в виде связанного списка.
 * 2) Сложите два числа и верните сумму в виде связанного списка.
 * Одно или два числа могут быть отрицательными.
 * 
 * Даны два Deque, цифры в обратном порядке.
 * [3,2,1,-] - пример Deque
 * [5,4,3]- пример второго Deque
 * 1) -123 * 345 = -42 435
 * Ответ всегда - связный список, в обычном порядке
 * [-,4,2,4,3,5] - пример ответа
 */
public class Task {

    public static void main(String[] args) {
        Deque<Integer> num1 = new LinkedList<Integer>();
        Deque<Integer> num2 = new LinkedList<Integer>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num2.add(7);
        num2.add(5);
        num2.add(2);
        num2.add(3);
        num2.add(5);

        int number1 = getDigits(num1);
        int number2 = getDigits(num2);
        int result1 = number1 * number2;
        int result2 = number1 + number2;

        System.out.printf(number1 + " * " + number2 + " = " + result1);
        System.out.println();
        System.out.println(convertToLinkedList(result1));
        System.out.printf(number1 + " + " + number2 + " = " + result2);
        System.out.println();
        System.out.println(convertToLinkedList(result2));

    }

    public static int getDigits(Deque<Integer> number) {
        int result = 0;
        while (!number.isEmpty()) {
            result = result * 10 + number.removeLast();
        }

        return result;
    }

    public static LinkedList<Integer> convertToLinkedList(int number) {
        LinkedList<Integer> ll = new LinkedList<>();
        if (number > 0) {
            while (number > 0) {
                ll.addFirst(number % 10);
                number /= 10;
            }
            return ll;
        } else {
            while (number < 0) {
                ll.addFirst(number % 10);
                number /= 10;
            }
        }
        return ll;
    }
}
