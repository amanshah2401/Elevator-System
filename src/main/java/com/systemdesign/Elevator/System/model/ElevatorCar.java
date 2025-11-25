package com.systemdesign.Elevator.System.model;

import com.systemdesign.Elevator.System.enums.Direction;
import com.systemdesign.Elevator.System.enums.ElevatorState;
import com.systemdesign.Elevator.System.model.panel.ElevatorPanel;

import java.util.*;

public class ElevatorCar {
    private int id;
    private ElevatorState state;
    private int currentFloor;

    public Direction getDirection() {
        return direction;
    }

    private Direction direction;
    private Door door;
    private ElevatorPanel panel;
    private Display display;
    private PriorityQueue<Integer> requests;

    public ElevatorCar(int id, int totalFloors) {
        this.id = id;
        this.state = ElevatorState.IDLE;
        this.currentFloor = 1;
        this.direction = Direction.IDLE;

        this.door = new Door();
        this.panel = new ElevatorPanel(totalFloors);
        this.display = new Display();

        this.requests = new PriorityQueue<>();
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void addRequest(int floor) {
        requests.add(floor);
        System.out.println("Elevator " + id + " received request for floor " + floor);
    }

    public void move() {
        if (requests.isEmpty()) {
            state = ElevatorState.IDLE;
            direction = Direction.IDLE;
            return;
        }

        int target = requests.poll();

        if (target > currentFloor) {
            state = ElevatorState.MOVING_UP;
            direction = Direction.UP;
        } else {
            state = ElevatorState.MOVING_DOWN;
            direction = Direction.DOWN;
        }

        System.out.println("Elevator " + id + " moving to floor " + target);

        currentFloor = target;

        stop();
    }

    public void stop() {
        System.out.println("Elevator " + id + " stopping at floor " + currentFloor);
        door.open();
        display.update(currentFloor, direction, 0);
        door.close();
    }

    public ElevatorPanel getPanel() {
        return panel;
    }

    public Display getDisplay() {
        return display;
    }
    public void setElevatorState(ElevatorState state) {
        this.state = state;
    }
    public ElevatorState getElevatorState() {
        return state;
    }
    public void clearAllRequests(){
        this.requests = new PriorityQueue<>();
    }
}

