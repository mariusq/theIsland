package com.example.theisland.domain;

import java.util.List;

public class IslandCell {
    private int xcord;
    private int ycord;
    private List<Predator> predators;
    private List<Prey> prey;
    private long food;


    public IslandCell(int xcord, int ycord) {
        this.xcord = xcord+1;
        this.ycord = ycord+1;
    }
    // if there are two fertile animals with different sex on the same cell, they have a chance of breeding
    // they have to be of the same type (prey or predator)
    public void breedAnimal() {
        // TODO implement here
    }

    public void predatorHunt() {
        // TODO implement here
    }

    public void preyEat() {
        // TODO implement here
    }

    public void addPrey() {
        prey.add(new Prey());
    }
    public void addPredator() {
        predators.add(new Predator());
    }

    public int getXcord() {
        return xcord;
    }

    public void setXcord(int xcord) {
        this.xcord = xcord;
    }

    public int getYcord() {
        return ycord;
    }

    public void setYcord(int ycord) {
        this.ycord = ycord;
    }

    public List<Predator> getPredators() {
        return predators;
    }

    public void setPredators(List<Predator> predators) {
        this.predators = predators;
    }

    public List<Prey> getPrey() {
        return prey;
    }

    public void setPrey(List<Prey> prey) {
        this.prey = prey;
    }

    public long getFood() {
        return food;
    }

    public void setFood(long food) {
        this.food = food;
    }

    public void addPredator(Predator predator) {
        this.predators.add(predator);
    }

    public void addPrey(Prey prey) {
        this.prey.add(prey);
    }

    public void removePredator(Predator predator) {
        this.predators.remove(predator);
    }

    public void removePrey(Prey prey) {
        this.prey.remove(prey);
    }

    public void addFood(long food) {
        this.food += food;
    }

    public void removeFood(long food) {
        this.food -= food;
    }

}
