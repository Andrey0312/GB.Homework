package ru.gb.l6.homework;

public class Horse extends Animal {

    public Horse (String name, int runLimit, int swimLimit, float jumpLimit) {
        super(name, runLimit, swimLimit, jumpLimit);
    }
    public void run(int distance) {
        System.out.println(name + runLimit);
    }
}
