package com.singtel.assignment;

class Parrots extends Bird {
    private final Animal animalLivesWith;

    public void sing() {
        if (animalLivesWith instanceof Cat) {
            Cat cat = (Cat) animalLivesWith;
            cat.mew();
        } else if (animalLivesWith instanceof Dog) {
            Dog dog = (Dog) animalLivesWith;
            dog.bark();
        } else if (animalLivesWith instanceof Chicken) {
            Chicken chicken = (Chicken) animalLivesWith;
            chicken.sing();
        }
    }

    Parrots(Animal animalLivesWith) {
        this.animalLivesWith = animalLivesWith;
    }
}

