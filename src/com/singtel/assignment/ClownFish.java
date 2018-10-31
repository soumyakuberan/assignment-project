package com.singtel.assignment;

class ClownFish extends Fish {
    void makesJokes() {
        System.out.println("makes Jokes");
    }

    ClownFish(String size, String color) {
        super(size,color);
        this.size = size;
        this.color = color;
    }
}
