package com.singtel.assignment;

public enum Roosters{

    DANISH("kykyliky"),
    DUTCH("kukeleku"),
    FINNISH("kukko kiekuu"),
    FRENCH("cocorico"),
    GERNAM("kikeriki"),
    GREEK("kikiriki"),
    HEBREW("coo-koo-ri-koo"),
    HUNGARIAN("kukuriku"),
    ITALIAN("chicchirichi"),
    JAPANESE("ko-ke-kok-ko-o"),
    PORTUGESE("cucurucu"),
    RUSSIAN("kukareku"),
    SWEDISH("kuckeliku"),
    TURKISH("kuk-kurri-kuuu"),
    URDU("kuklooku");

    private String sound;

    Roosters(String sound){
        this.sound = sound;
    }

    public String getSound(){
        return sound;
    }

}
