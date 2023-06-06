package oop;

public class Classes {
    public static void main(String[] args) {
        Students students = new Students();
        Students student1 = new Students(20, "Duvan", "Marin", "duvan@mail");
        System.out.println(students.age);
        System.out.println(student1.age);

    }
}

class Students {
    int age;
    String name;
    String surname;
    String email;

    Students() {
        this(12, "Branduvis", "Brarara", "Mail");
    }

    Students(int age, String name, String surname, String email) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

}
