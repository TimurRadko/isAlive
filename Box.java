package com.timurradko.itsAlive;

import java.util.Random;

public class Box {
    private static Random random = new Random();
    private boolean opened = false;
    public boolean catIsAlive;

    public Box(Cat cat) {
        this.catIsAlive = cat.getIsAlive();
    }

    void openBox() {
        opened = true;
        this.catIsAlive = getRandomVariety() != 0;
    }

    int catAliveProbability () {
        if (!opened) {
            return 50;
        } else if (!this.catIsAlive) {
            System.out.println("The probability that the cat is alive: 0 %");
            System.out.println("Sorry, Cat died");
            return 0;
        } else {
            System.out.println("The probability that the cat is alive: 100 %");
            System.out.println("Congratulation, Cat is alive");
            return 100;
        }
    }

    private int getRandomVariety() {
        return random.nextInt(2);
    }
}
