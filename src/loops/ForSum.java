package loops;

public class ForSum {
    public static void main(String[] args) {
        int n = 1000;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
