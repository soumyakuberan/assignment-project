package com.singtel.assignment;

class Parrots extends Bird {
    private Animal animalLivesWith;

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


    public void setAnimalLivesWith(Animal animal){
        animalLivesWith = animal;

    }
}

