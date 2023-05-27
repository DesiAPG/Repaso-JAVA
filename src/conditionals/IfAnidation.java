package conditionals;

public class IfAnidation {
    public static void main(String[] args) {
        int age = 34;
        int weight = 65;
        if (age >= 18) {
            if (weight >= 60 && weight <= 100) {
                System.out.println("You can donate blood");
            }
        } else {
            System.out.printf("You can't donate blood");
        }
    }
}
