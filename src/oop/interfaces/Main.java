package oop.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.acc();
        car.brake();
        car.start();
        System.out.println(car.price);
    }
}
