package org.example;

import java.sql.SQLOutput;

public class App
{
    public static void main( String[] args ) {
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
        System.out.println("-------------------------------------");

        byte m=30;
        System.out.println(m+"-й член последовательности Фибоначчи: "+fibonazzi(m));
    }
        public static long fibonazzi(byte n){
        if (n <= 1) {
            return (long)0;
        } else if (n == 2) {
            return (long)1;
        } else {
            return fibonazzi((byte) (n-2)) + fibonazzi((byte) (n-1));
        }
    }

}
