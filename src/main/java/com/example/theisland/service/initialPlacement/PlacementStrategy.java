package com.example.theisland.service.initialPlacement;

import com.example.theisland.domain.IslandCell;

public interface PlacementStrategy {
    void populateIsland(IslandCell[][] islandGrid, int startPrey, int startPredator);
}
