package conditionals;

import java.util.Scanner;

public class weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question question = new Question();
        System.out.println("How is the weather?");
        String myDay = scanner.nextLine();
        question.weather(myDay);
    }
}
