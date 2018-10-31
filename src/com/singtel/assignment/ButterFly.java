package com.singtel.assignment;

class ButterFly extends CaterPiller implements Flyers {
    public void fly() {
        System.out.println("Butterfly can fly");
    }

    public boolean canFly() {
        return true;
    }

}