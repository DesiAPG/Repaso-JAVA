package methods;

public class Shadowing {
    static int x = 10;

    public static void main(String[] args) {
        System.out.println(x);
        int x = 0;
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
