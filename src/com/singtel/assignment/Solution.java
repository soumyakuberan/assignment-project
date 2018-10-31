package com.singtel.assignment;

class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();

        Animal[] animals;
        animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken("normal"),
                new Chicken("rooster"),
                new Parrots(new Cat()),
                new Fish(),
                new Shark("large", "Grey"),
                new ClownFish("small", "orange"),
                new Dolphin(),
                new Dog(),
                new ButterFly(),
                new Cat()
        };
        int countOfWalkingAnimals = 0;
        int countOfFlyingAnimals = 0;
        int countOfSingingAnimals = 0;
        int countOfSwimmingAnimals = 0;
        for (Animal animal : animals) {
            if (animal.canWalk() && !(animal instanceof Swimmers)) {
                countOfWalkingAnimals = countOfWalkingAnimals + 1;
            }
            if (animal instanceof Flyers) {
                Flyers flyers = (Flyers) animal;
                if (flyers.canFly()) {
                    countOfFlyingAnimals = countOfFlyingAnimals + 1;
                }
            }
            if (animal instanceof Singers) {
                Singers singers = (Singers) animal;
                if (singers.canSing()) {
                    countOfSingingAnimals = countOfSingingAnimals + 1;
                }
            }
            if (animal instanceof Swimmers) {
                Swimmers swimmer = (Swimmers) animal;
                if (swimmer.canSwim()) {
                    countOfSwimmingAnimals = countOfSwimmingAnimals + 1;
                }
            }

        }
        System.out.println("countOfWalkingAnimals" + countOfWalkingAnimals);
        System.out.println("countOfFlyingAnimals" + countOfFlyingAnimals);
        System.out.println("countOfSingingAnimals" + countOfSingingAnimals);
        System.out.println("countOfSwimmingAnimals" + countOfSwimmingAnimals);
    }

}
