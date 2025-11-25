package com.systemdesign.Elevator.System.model.button;

public class EmergencyButton extends Button {

    public void pressEmergency() {
        System.out.println("⚠ Emergency button pressed! Alerting support team!");
        super.press();
    }
}

