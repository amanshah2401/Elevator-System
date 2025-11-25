package com.systemdesign.Elevator.System.model;

import java.util.List;

public class Dispatcher {

    public ElevatorCar findBestElevator(int floor, List<ElevatorCar> elevators) {
        ElevatorCar best = null;
        int minDistance = Integer.MAX_VALUE;

        for (ElevatorCar e : elevators) {
            int distance = Math.abs(e.getCurrentFloor() - floor);
            if (distance < minDistance) {
                minDistance = distance;
                best = e;
            }
        }
        return best;
    }
}

