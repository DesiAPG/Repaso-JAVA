package dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0}
        };*/

        int[][] arr = new int[3][3];

        // input
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = scanner.nextInt();
            }
        }

        for (int[] a : arr
        ) {
            System.out.println(Arrays.toString(a));
        }
    }
}
