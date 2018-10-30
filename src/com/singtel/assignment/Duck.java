package com.singtel.assignment;

class Duck extends Bird implements Swimmers{
    public void sing(){
        System.out.println("Quack Quack");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}