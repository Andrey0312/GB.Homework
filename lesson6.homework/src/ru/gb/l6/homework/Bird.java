package ru.gb.l6.homework;


public class Bird extends Animal {

    public Bird (String name, int runLimit, int swimLimit, float jumpLimit) {
        super(name, runLimit, swimLimit, jumpLimit);
    }

    public boolean swimLimit (int distance) {
        return false;
    }
    public void run(int distance) {
        System.out.println(name + runLimit);
    }

}
