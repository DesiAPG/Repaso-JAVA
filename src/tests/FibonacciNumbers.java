package tests;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the fibonacci number you want to find?");
        int c = scanner.nextInt();
        for (int i = 0; i < c; i++) {
            b += a;
            a = b - a;
        }
        c = a;
        System.out.println(c);
    }
}
