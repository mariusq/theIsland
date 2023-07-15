package com.example.theisland.domain;

public abstract class Animal {
    private int age;
    private double hunger;
    private String sex;
    private int yCord;
    private int xCord;
    private double health;
    private boolean isAlive;
    private String causeOfDeath;

    public Animal(int age, double hunger, String sex, int yCord, int xCord) {
        this.age = age;
        this.hunger = hunger;
        this.sex = sex;
        this.yCord = yCord;
        this.xCord = xCord;
        isAlive = true;

    }

    public Animal() {
    }
    // the animal will move to a random adjacent cell
    // will be drawn towards food (prey for predators, food for prey)
    // with the chance of moving being higher if hunger is high
    // and the lower available food is (food for prey, other animals for predators)
    // might have to implement it somewhere else.
    public void move() {
        // TODO implement here
    }
    public void calculateHealth(double ageImpactOnDeath, double hungerImpactOnDeath) {
        double youngAgeRiskFactor = (age <= 12) ? 1.2 : 1.0;
        health = 1-((age * ageImpactOnDeath * youngAgeRiskFactor) + (hunger * hungerImpactOnDeath));
    }

    // if there are two fertile animals with different sex on the same cell, they have a chance of breeding
    // they have to be of the same type (prey or predator)
    // might have to implement it somewhere else.
    public void breed() {
        // TODO implement here
    }

    public void die(double generalDeathRate, int maximumLifeSpan) {
        if (age >= maximumLifeSpan) {
            isAlive = false;
            causeOfDeath = "Old age";
        }
        else if (health - generalDeathRate < Math.random()) {
            isAlive = false;
            causeOfDeath = "Unexplained death";
        }
        else if (hunger >= 1) {
            isAlive = false;
            causeOfDeath = "Starvation";
        }
    }
    public void age() {
        age++;
    }
    public double getYears() {
        return((double) age /12);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHunger() {
        return hunger;
    }

    public void setHunger(double hunger) {
        this.hunger = hunger;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getyCord() {
        return yCord;
    }

    public void setyCord(int yCord) {
        this.yCord = yCord;
    }

    public int getxCord() {
        return xCord;
    }

    public void setxCord(int xCord) {
        this.xCord = xCord;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }
}