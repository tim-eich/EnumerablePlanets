package org.launchcode.models;

public enum Planets {

    MERCURY("Mercury"),
    VENUS("Venus"),
    EARTH("Earth"),
    MARS("Mars"),
    JUPITER("Jupiter"),
    SATURN("Saturn"),
    URANUS("Uranus"),
    NEPTUNE("Neptune");

    private final String name;

    Planets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
