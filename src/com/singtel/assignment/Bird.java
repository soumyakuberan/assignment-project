package com.singtel.assignment;

class Bird extends Animal implements Flyers,Singers {

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public void sing() {
        System.out.println("I can Sing");
    }

    @Override
    public boolean canSing() {
        return true;
    }
}