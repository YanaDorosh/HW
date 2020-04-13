package com.solvd.ships;

public enum Season {
    WINTER("winter", 25, -50),
    SPRING("spring", 35, -15),
    SUMMER("sammer", 55, -3),
    FALL("fall", 35, -20);


    private int max_temperature;
    private int min_temperature;
    private String name;

    Season(String name, int max_temperature, int min_temperature) {
        this.max_temperature = max_temperature;
        this.min_temperature = min_temperature;
        this.name = name;

    }

    public int getMaxTemperature() {
        return max_temperature;
    }

    public int getMinTemperature() {
        return min_temperature;
    }

    public String getName() {
        return name;
    }
}
