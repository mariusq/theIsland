package com.example.theisland.domain;

import com.example.theisland.domain.IslandCell;
import com.example.theisland.domain.Prey;

public class Island {
    private IslandCell[][] islandGrid;

    public Island(int size) {
        islandGrid = new IslandCell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                islandGrid[i][j] = new IslandCell(i,j);
            }
        }
    }

    public IslandCell[][] getIslandGrid() {
        return islandGrid;
    }

    public void setIslandGrid(IslandCell[][] islandGrid) {
        this.islandGrid = islandGrid;
    }

    public void populateIsland(IslandCell[][] islandGrid, int startPrey, int startPredator, boolean randomPlacement) {
    }

    // moves animals on the island
    // will be more likely to move if they're hungry and there is a lack of food
    public void moveAnimals(IslandCell[][] islandGrid) {
        // TODO Implement this method
    }
}
