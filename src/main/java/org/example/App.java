package org.example;

public class App
{
    public static void main( String[] args )
    {
       int a = 111;
       int b = 222;
       System.out.println("Было:");
       System.out.println("a="+a+ " b="+b);

       // хитрый способ без третьей переменной ;)
        a=b+a;
        b=a-b;
        a=a-b;

        System.out.println("\nСтало:");
        System.out.println("a="+a+ " b="+b);

    }
}
