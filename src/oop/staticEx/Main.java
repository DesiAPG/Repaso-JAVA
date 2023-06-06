package oop.staticEx;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(22, "Duvan", 10, false);
        Human human1 = new Human(21, "Camilo", 3245, true);
        Human human3 = new Human(21, "Camilo", 3245, true);
        Human human4 = new Human(21, "Camilo", 3245, true);
        Human human13 = new Human(21, "Camilo", 3245, true);
        Human human14 = new Human(21, "Camilo", 3245, true);
        Human human16 = new Human(21, "Camilo", 3245, true);
        System.out.println(human.population);
    }
}
