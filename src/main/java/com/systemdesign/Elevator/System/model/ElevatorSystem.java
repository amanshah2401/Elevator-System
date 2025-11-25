package com.systemdesign.Elevator.System.model;

import com.systemdesign.Elevator.System.enums.Direction;

public class ElevatorSystem {
    private Building building;
    private Dispatcher dispatcher;

    public ElevatorSystem(Building building) {
        this.building = building;
        this.dispatcher = new Dispatcher();
    }

    public void requestElevator(int floor, Direction direction) {
        System.out.println("Hall call from floor " + floor + " going " + direction);

        ElevatorCar best =
                dispatcher.findBestElevator(floor, building.getElevators());

        best.addRequest(floor);
        best.move();
    }
}

