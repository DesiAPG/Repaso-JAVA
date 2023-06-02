package tests.dataStructures;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1123, 57, 23, 7, 4, 5, 3, 23, 4, 234, 23, 4, 23, 424234234, 234, 2342, 342, 342, 34, 34};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 5, 8));
    }

    static int maxRange(int[] arr, int a, int b) {
        int max = 0;
        for (int i = a; i <= b; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int max(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
}
