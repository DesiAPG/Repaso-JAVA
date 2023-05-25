package conditionals;

public class Question {
    public void weather(String myDay) {
        if (myDay.equals("sunny")) {
            System.out.println("Walk the dog");
        } else if (myDay.equals("cloudy")) {
            System.out.println("Read a book");
        } else if (myDay.equals("raining")) {
            System.out.println("watch a movie");
        } else {
            System.out.println("Go to sleep");
        }
    }
}
