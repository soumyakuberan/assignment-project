package com.singtel.assignment;

import java.util.ArrayList;

class Shark extends Fish {
    private final ArrayList<Fish> fishes = new ArrayList<>();

    void eats(Fish fish) {
        fishes.add(fish);
    }

    Shark(String size, String color) {
        super(size,color);
        this.size = size;
        this.color = color;
    }
}
