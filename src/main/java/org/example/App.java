package org.example;

import java.sql.SQLOutput;

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
        System.out.println("----------< Последовательность Фибоначчи >----------------------");

        byte m = 17;   // задать номер члена последовательности Фибоначчи, не более 47, который нужно опеределить
        System.out.println(m + "-й член последовательности Фибоначчи: " + fibonazzi(m));
        System.out.println("----------< Является ли число простым >-------------------------");
        int s = 991;  // вести число для определения простое оно или нет
        if (s>1) {
            int r = isSimple(s);
            if (r == 0) {
                System.out.println("Число " + s + " - простое число");
            } else {
                System.out.println("Число " + s + " делится на " + r);
            }
        }
        if (s<=1) {
            System.out.println("Для числа " + s + " нельзя определить простое оно или нет!");
        }

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
}