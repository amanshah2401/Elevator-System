package com.systemdesign.Elevator.System.model;

import com.systemdesign.Elevator.System.enums.DoorState;

class Door {
    private DoorState state = DoorState.CLOSED;

    public void open() {
        state = DoorState.OPEN;
        System.out.println("Door opening...");
    }

    public void close() {
        state = DoorState.CLOSED;
        System.out.println("Door closing...");
    }

    public DoorState getState() {
        return state;
    }
}

