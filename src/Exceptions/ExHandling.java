package Exceptions;

public class ExHandling {
    public static void main(String[] args) {
        try {
            int a = 13;
            int b = 0;
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
