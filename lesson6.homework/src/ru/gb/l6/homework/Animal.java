package ru.gb.l6.homework;

public class Animal {
    public String name;
    public int runLimit;
    public int swimLimit;
    public float jumpLimit;

    public Animal(String name, int runLimit, int swimLimit, float jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + "пробежал" + distance + "м");
        } else if (distance > runLimit) {
            System.out.println(name + "может пробежать только" + runLimit + "м");
        }

    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + "проплыл" + distance + "м");
        } else if (distance > swimLimit) {
            System.out.println(name + "может проплыть только" + swimLimit + "м");
        }

    }
    public void jump(float distance) {
            if (distance <= jumpLimit) {
                System.out.println(name + "прыгнул на " + distance + "м");
            } else if (distance > jumpLimit) {
                System.out.println(name + "может прыгнуть только на" + jumpLimit + "м");
            }
        }
    }

