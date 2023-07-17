package com.example.theisland.domain;



public class Predator extends Animal{
    int kills;
    public Predator(int age, double hunger, String sex, int yCord, int xCord) {
        super(age, hunger, sex, yCord, xCord);
    }

    public Predator() {
    }

    public void hunt(Prey prey) {
        // TODO implement here
    }
}
