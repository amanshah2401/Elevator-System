package com.systemdesign.Elevator.System.model.button;

public class ElevatorButton extends Button {
    private final int destinationFloor;

    public ElevatorButton(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }
}

