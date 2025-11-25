package com.systemdesign.Elevator.System.model;

import com.systemdesign.Elevator.System.enums.Direction;

class Display {
    private int currentFloor;
    private Direction direction;
    private int capacity;

    public void update(int floor, Direction direction, int capacity) {
        this.currentFloor = floor;
        this.direction = direction;
        this.capacity = capacity;
    }

    public void showElevatorDisplay() {
        System.out.println("[Elevator Display] Floor: " + currentFloor +
                " | Direction: " + direction +
                " | Capacity: " + capacity);
    }

    public void showHallDisplay() {
        System.out.println("[Hall Display] Elevator at Floor: " + currentFloor +
                " | Direction: " + direction);
    }
}

