package oop.abstractC;

public class Son extends SuperC {
    @Override
    void career(String name) {
        System.out.println("Im going to be a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I am " + name + " and I am " + age);
    }
}
