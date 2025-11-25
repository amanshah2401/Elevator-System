package com.systemdesign.Elevator.System.model;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Floor> floors;
    private List<ElevatorCar> elevators;

    public Building(int totalFloors, int totalElevators) {
        floors = new ArrayList<>();
        elevators = new ArrayList<>();

        for (int i = 1; i <= totalFloors; i++)
            floors.add(new Floor(i, totalFloors));

        for (int i = 1; i <= totalElevators; i++)
            elevators.add(new ElevatorCar(i, totalFloors));
    }

    public List<Floor> getFloors() { return floors; }
    public List<ElevatorCar> getElevators() { return elevators; }
}

