package com.singtel.assignment;

public class Fish extends Animal implements Swimmers {
    String size;
    String color;

    public Fish(){

    }

    Fish(String size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}