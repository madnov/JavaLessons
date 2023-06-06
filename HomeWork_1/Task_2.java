package HomeWork_1;

// Вывести все простые числа от 1 до 1000

public class Task_2 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int limit = 1000;
        for (int i = 1; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

}
