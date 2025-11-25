package com.systemdesign.Elevator.System.model.button;

import com.systemdesign.Elevator.System.enums.Direction;

public class HallButton extends Button {
    private int floorNumber;
    private Direction direction;

    public HallButton(int floorNumber, Direction direction) {
        this.floorNumber = floorNumber;
        this.direction = direction;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Direction getDirection() {
        return direction;
    }
}

