package ru.gb.l6.homework;

public class Dog extends Animal {

    public Dog (String name, int runLimit, int swimLimit, float jumpLimit) {
        super(name, runLimit, swimLimit, jumpLimit);
    }
    public void run() {
        System.out.println(name + runLimit);
    }
}

