package org.example;

public class App {
    public static void main(String[] args) {
        int a = 111;
        int b = 222;
        System.out.println("Было:");
        System.out.println("a=" + a + " b=" + b);
        // хитрый способ без третьей переменной ;)
        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println("Стало:");
        System.out.println("a=" + a + " b=" + b);
        System.out.println("\n*-------< Последовательность Фибоначчи >--------------------------------------------------");

        byte m = 17;   // задать номер члена последовательности Фибоначчи, не более 47, который нужно опеределить
        System.out.println(m + "-й член последовательности Фибоначчи: " + fibonazzi(m));
        System.out.println("\n*-------< Является ли число простым >-----------------------------------------------------");
        int s = 1001;  // вести число для определения простое оно или нет
        if (s>1) {
            int r = isSimple(s);
            if (r == 0) {
                System.out.println("Число " + s + " - простое число");
            } else {
                System.out.println("Число " + s + " не является простым и делится на " + r);
            }
        }
        if (s<=1) {
            System.out.println("Для числа " + s + " нельзя определить простое оно или нет!");
        }

        System.out.println("\n*----< Наибольший индекс элемента массива, имеющего максимальную сумму цифр >-------------");
        int[] mas = {19239,245592,6891,12345,11111111,999,817181,376127,234188,12321}; // ввод массива
        System.out.println("массив из "+mas.length+ " элементов:");
        for (int k: mas){
            System.out.print(k+"  ");
        }
        System.out.println("\nНаибольший индекс элемента с макс. суммой цифр: "+maxDigitsSumPosition(mas));

    }

    public static long fibonazzi(byte n) {
        if (n <= 1) {
            return (long) 0;
        } else if (n == 2) {
            return (long) 1;
        } else {
            return fibonazzi((byte) (n - 2)) + fibonazzi((byte) (n - 1));
        }
    }

    public static int isSimple(int n) {
        if (n > 2) {
            int i = 2;
            int d = 0;
            while ((i < n) & (d == 0)) {
                if (n % i == 0) {
                    d = i;
                }
                i++;
            }
            return d;
        } else {
            return 2;
        }
    }

    public static int sumDigits(int num){
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = (int) num / 10;
        }
        return sum;
    }

    public static byte maxDigitsSumPosition(int[] arr){
        int max= sumDigits(arr[0]);
        byte i_max=0;
        for (byte i=1; i<arr.length; i++) {
            if (sumDigits(arr[i])>=max) {
                max= sumDigits(arr[i]);
                i_max=i;
            }
        }
        return i_max;
        }

}