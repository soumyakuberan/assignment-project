package com.singtel.assignment;

class Dolphin extends Animal implements Swimmers {

    @Override
    public void swim() {
        System.out.println("i can swim");
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}
