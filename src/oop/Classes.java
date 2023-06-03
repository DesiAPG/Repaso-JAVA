package oop;

public class Classes {
    public static void main(String[] args) {
        Students students = new Students();
        System.out.println(students.age);
    }
}

class Students {
    int age = 1;
    String name = "Duvan";
}
