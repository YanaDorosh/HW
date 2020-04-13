package com.solvd.ships;

public class Permission {
    public Boat getPermission(Season season) {
        Boat boat = null;

        switch (season) {
            case WINTER:
                System.out.println("Season: " + Season.WINTER.getName());
                System.out.println("Max Temperature: " + Season.WINTER.getMaxTemperature());
                System.out.println("Min Temperature: " + Season.WINTER.getMinTemperature());
                System.out.println("================================");
                break;

            case FALL:
                System.out.println("Season: " + Season.FALL.getName());
                System.out.println("Max Temperature: " + Season.FALL.getMaxTemperature());
                System.out.println("Min Temperature: " + Season.FALL.getMinTemperature());
                System.out.println("================================");
                break;

            case SPRING:
                System.out.println("Season: " + Season.SPRING.getName());
                System.out.println("Max Temperature: " + Season.SPRING.getMaxTemperature());
                System.out.println("Min Temperature: " + Season.SPRING.getMinTemperature());
                System.out.println("================================");
                break;

            case SUMMER:
                System.out.println("Season: " + Season.SUMMER.getName());
                System.out.println("Max Temperature: " + Season.SUMMER.getMaxTemperature());
                System.out.println("Min Temperature: " + Season.SUMMER.getMinTemperature());
                System.out.println("================================");
                break;
            default:
                System.out.println("enter correct numbe");
        }
        return boat;
    }
}
