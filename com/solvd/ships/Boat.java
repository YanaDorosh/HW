package com.solvd.ships;

    public abstract class Boat {

        private String type;
        private int size ;
        private int speed;

        public Boat() {

        }

        public Boat(String type, int size, int speed) {
            this.type = type;
            this.size = size;
            this.speed = speed;
        }

        public void printInfo() {
            System.out.println("Type: " + type);
            System.out.println("Size: " + size);
            System.out.println("Speed: " + speed);

        }
}
