package tests.methods;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        for (int i = 100; i < 1000; i++) {
            if (isAmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isAmstrong(int n) {
        int a = n;
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            a = a / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == n;
    }
}
