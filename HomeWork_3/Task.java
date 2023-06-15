package HomeWork_3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Задание

// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

public class Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = prepareArray(n);
        System.out.println("Первоначальный массив: ");
        System.out.println(arr.toString());
        System.out.println("Массив с удалёнными чётными числами: ");
        System.out.println(deleteOddNumbers(arr));
        getMaxMinAndPrint(arr);
        getAverage(arr);
    }

    private static void getMaxMinAndPrint(ArrayList<Integer> arr) {
        int max = 0;
        int min = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        System.out.print("Минимальное значение массива: ");
        System.out.println(max);
        System.out.print("Максимальное значение массива: ");
        System.out.println(min);

    }

    private static void getAverage(ArrayList<Integer> arr) {
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total += arr.get(i);
        }

        int average = total / arr.size();
        System.out.print("Среднее значение массива: ");
        System.out.println(average);
    }

    private static ArrayList<Integer> deleteOddNumbers(ArrayList<Integer> arr) {

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
                i--;
            }
        }
        return arr;
    }

    private static ArrayList<Integer> prepareArray(int length) {
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arr.add(random.nextInt(100));
        }

        return arr;

    }

}
