package dataStructures;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysPassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {4, 34, 7, 8, 23, 5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
