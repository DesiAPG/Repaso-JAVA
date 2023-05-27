package tests;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is the largest number");
        } else if (b > c) {
            System.out.println(b + " is the largest number");
        } else {
            System.out.println(c + " is the largest number");
        }
    }
}
