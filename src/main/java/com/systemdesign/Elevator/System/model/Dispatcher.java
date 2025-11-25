package com.systemdesign.Elevator.System.model;

import com.systemdesign.Elevator.System.enums.Direction;
import com.systemdesign.Elevator.System.enums.ElevatorState;

import java.util.List;

public class Dispatcher {

    public ElevatorCar findBestElevator(int requestFloor, Direction requestDirection,
                                        List<ElevatorCar> elevators) {

        ElevatorCar bestElevator = null;
        int bestScore = Integer.MIN_VALUE;
        int minDistance = Integer.MAX_VALUE;

        for (ElevatorCar e : elevators) {

            // Skip elevators under maintenance
            if (e.getElevatorState() == ElevatorState.MAINTENANCE) {
                continue;
            }

            int score = 0;

            int elevatorFloor = e.getCurrentFloor();
            Direction elevatorDirection = e.getDirection();
            ElevatorState state = e.getElevatorState();

            // ------- Tier 1: Moving in same direction & will pass the floor -------
            if (state != ElevatorState.IDLE && elevatorDirection == requestDirection) {

                if (elevatorDirection == Direction.UP && elevatorFloor <= requestFloor) {
                    score = 3; // perfect match
                } else if (elevatorDirection == Direction.DOWN && elevatorFloor >= requestFloor) {
                    score = 3;
                }
            }

            // ------- Tier 2: Elevator is IDLE -------
            else if (state == ElevatorState.IDLE) {
                score = 2;
            }

            // ------- Tier 3: Opposite direction -------
            else {
                score = 1; // least preferred
            }

            // ------- Distance factor: only tiebreak between equal scores -------
            int distance = Math.abs(elevatorFloor - requestFloor);

            if (score > bestScore || (score == bestScore && distance < minDistance)) {
                bestElevator = e;
                bestScore = score;
                minDistance = distance;
            }
        }

        return bestElevator;
    }

}

