package com.example.theisland.service.initialPlacement;

import com.example.theisland.domain.IslandCell;
import com.example.theisland.domain.Prey;

public class DistributedPlacement implements PlacementStrategy{
    @Override
    public void populateIsland(IslandCell[][] islandGrid, int startPrey, int startPredator) {
        int size = islandGrid.length;
        int preyPlaced = 0;
        int predatorPlaced = 0;

        for (int i = 0; i < size * size; i++) {
            int row = i / size;
            int col = i % size;

            if (preyPlaced < startPrey) {
                islandGrid[row][col].addPrey();
                preyPlaced++;
            }

            if (predatorPlaced < startPredator) {
                islandGrid[row][col].addPredator();
                predatorPlaced++;
            }

            if (preyPlaced >= startPrey && predatorPlaced >= startPredator) {
                break;
            }
        }
    }
}
