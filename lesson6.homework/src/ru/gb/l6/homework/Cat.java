package ru.gb.l6.homework;

public class Cat extends Animal {

    public Cat (String name, int runLimit, int swimLimit, float jumpLimit) {
        super(name, runLimit, swimLimit, jumpLimit);
    }

    public boolean swimLimit (int distance) {
        return false;
    }
    public void run(int distance) {
        System.out.println(name + runLimit);
    }
}
