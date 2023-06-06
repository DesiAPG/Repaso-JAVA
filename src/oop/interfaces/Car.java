package oop.interfaces;

public class Car implements Engine, Brake {

    @Override
    public void brake() {
        System.out.println("Brake");
    }

    @Override
    public void start() {
        System.out.println("Starting");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating");
    }
}
