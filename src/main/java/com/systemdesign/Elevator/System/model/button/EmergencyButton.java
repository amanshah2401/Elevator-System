package com.systemdesign.Elevator.System.model.button;

import com.systemdesign.Elevator.System.enums.ElevatorState;
import com.systemdesign.Elevator.System.model.ElevatorCar;

public class EmergencyButton extends Button {
    public void setElevatorCar(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    private ElevatorCar elevatorCar;

    public EmergencyButton(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }
    public EmergencyButton( ) {
    }


    public void pressEmergency() {
        System.out.println("⚠ Emergency button pressed! Alerting support team!");
        System.out.println("Stop the elevator immediately");
        System.out.println("Open the door");
        System.out.println("Switch elevator to MAINTENANCE");
        System.out.println("Clear all requests");
        System.out.println("Alert support");
        elevatorCar.stop();
        elevatorCar.clearAllRequests();
        elevatorCar.setElevatorState(ElevatorState.MAINTENANCE);
        super.press();
    }
}

