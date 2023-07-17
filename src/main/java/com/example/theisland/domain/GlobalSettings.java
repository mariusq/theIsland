package com.example.theisland.domain;

import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalSettings {
    //Prey settings
    double preyBreedRate;
    int preyFertilityAgeMin;
    int preyFertilityAgeMax;
    int preyMaximumLifeSpan;
    //Predator settings
    double predatorBreedRate;
    int predatorFertilityAgeMin;
    int predatorFertilityAgeMax;
    int predatorMaximumLifeSpan;
    double predatorHuntAge;
    //General Settings
    double hungerDecayRate;
    boolean randomPlacement;
    //Death Settings
    double hungerImpactOnDeath;
    double ageImpactOnDeath;
    double generalDeathRate;


}
