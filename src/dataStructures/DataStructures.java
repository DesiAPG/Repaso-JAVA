package dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class DataStructures {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + " number");
            arr[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        String[] strings = new String[5];
        
    }
}
