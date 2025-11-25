package com.systemdesign.Elevator.System.model.panel;

import com.systemdesign.Elevator.System.model.button.Button;
import com.systemdesign.Elevator.System.model.button.ElevatorButton;
import com.systemdesign.Elevator.System.model.button.EmergencyButton;

import java.util.*;

public class ElevatorPanel {
    private List<ElevatorButton> floorButtons;
    private Button openButton;
    private Button closeButton;
    public EmergencyButton emergencyButton;

    public ElevatorPanel(int totalFloors) {
        floorButtons = new ArrayList<>();
        for (int i = 1; i <= totalFloors; i++) {
            floorButtons.add(new ElevatorButton(i));
        }
        openButton = new Button() {};
        closeButton = new Button() {};
        emergencyButton = new EmergencyButton();
    }

    public ElevatorButton getFloorButton(int floor) {
        return floorButtons.get(floor - 1);
    }

    public Button getOpenButton() { return openButton; }
    public Button getCloseButton() { return closeButton; }
    public EmergencyButton getEmergencyButton() { return emergencyButton; }
}

