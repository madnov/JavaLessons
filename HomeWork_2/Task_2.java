package HomeWork_2;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите количество чисел для ввода: ");
        int count = sc.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Введите " + (i + 1) + " число: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Массив после сортировки: ");
        bubbleSort(array);

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        try (FileWriter writer = new FileWriter("HomeWork_2\\text.txt", false)) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                writer.write(Arrays.toString(arr) + "\n");
            }
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }

        System.out.println(Arrays.toString(arr));
    }
}
