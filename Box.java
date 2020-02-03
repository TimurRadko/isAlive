package com.timurradko.itsAlive;

import java.util.Random;

public class Box {
    private static Random random = new Random();
    boolean opened = false;

    Box(Cat cat) {
        cat.isAlive = cat.getIsAlive();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Box box = new Box(cat);
        System.out.println("The probability that the cat is alive: " + box.catAliveProbability(cat) + " %");
        System.out.print("Open the box: ");
        box.openBox(cat);
        box.catAliveProbability(cat);

    }

    void openBox(Cat cat) {
        int i = random.nextInt(2);
        opened = true;
        if (i == 0) {
            cat.isAlive = false;
        } else {
            cat.isAlive = true;
        }
    }

    int catAliveProbability (Cat cat) {
        if (!opened) {
            return 50;
        } else if (!cat.isAlive) {
            System.out.println("The probability that the cat is alive: 0 %");
            System.out.println("Sorry, Cat died");
            return 0;
        } else {
            System.out.println("The probability that the cat is alive: 100 %");
            System.out.println("Congratulation, Cat is alive");
            return 100;
        }
    }
}
