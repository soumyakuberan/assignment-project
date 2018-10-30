package com.singtel.assignment;

import java.util.ArrayList;

class Shark extends Fish{
    ArrayList<Fish> fishes = new ArrayList<Fish>();

    void eats(Fish fish){
        fishes.add(fish);
    }
    Shark(String size,String color){
        this.size = size;
        this.color = color;
    }
}
