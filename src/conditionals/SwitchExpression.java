package conditionals;

public class SwitchExpression {

    public static void main(String[] args) {
        int day = 3;
        String myDay = "";
        switch (day) {
            case 1:
                myDay = "Monday";
                break;
            case 2:
                myDay = "Tuesday";
            case 3:
                myDay = "Wednesday";
                break;
            case 4:
                myDay = "Thursday";
            case 5:
                myDay = "Friday";
                break;
            case 6:
                myDay = "Saturday";
            case 7:
                myDay = "Sunday";
        }
        System.out.println(myDay);
    }
}
