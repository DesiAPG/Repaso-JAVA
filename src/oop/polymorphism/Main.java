package oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();

        circle.area();
    }
}
