package methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        parameters(1, 4, 76, 3, 34, 456, 23, 7, 7, 345, 345, 34, 5, 3423, 4);
    }

    static void parameters(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
