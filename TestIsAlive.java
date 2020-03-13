package com.timurradko.itsAlive;

public class TestIsAlive {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Box box = new Box(cat);
        System.out.println("The probability that the cat is alive (before the box open): " + box.catAliveProbability() + "%");
        System.out.println("Open the box: ");
        box.openBox();
        box.catAliveProbability();
    }
}
