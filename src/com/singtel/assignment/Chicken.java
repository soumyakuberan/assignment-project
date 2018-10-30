package com.singtel.assignment;

class Chicken extends Animal implements Singers,Flyers{
    String type;
    public void sing(){
        if("rooster".equals(type)){
            System.out.println("“Cock-a-doodle-doo");
        }else if("normal".equals(type)){
            System.out.println("Cluck cluck");
        }
    }
    Chicken(String type){
        this.type = type;
    }

    public boolean canSing(){
        return true;
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public boolean canFly() {
        return true;
    }
}