package oop.inheritance;

public class Box {
    double lenght;
    double height;
    double width;

    Box(double lenght, double height, double width) {
        this.lenght = lenght;
        this.height = height;
        this.width = width;
    }

    Box(double side) {
        this.lenght = side;
        this.width = side;
        this.height = side;
    }

    Box() {
        this.lenght = -1;
        this.height = -1;
        this.width = -1;
    }

    Box(Box old) {
        this.lenght = old.lenght;
        this.width = old.width;
        this.height = old.height;
    }

    public void info() {
        System.out.println("Pushing the box");
    }

}
