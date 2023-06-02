package tests.dataStructures;

import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {
        int[] arr = {1123, 57, 23, 7, 3, 34, 6, 457, 46, 75, 67, 78567, 567, 56, 756, 7};
        //swap(arr, 0, 3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int arr[]) {
        int a = 0;
        int b = arr.length - 1;

        while (a < b) {
            swap(arr, a, b);
            a++;
            b--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


}
