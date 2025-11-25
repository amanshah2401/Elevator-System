package com.systemdesign.Elevator.System.model;


import com.systemdesign.Elevator.System.model.panel.HallPanel;

public class Floor {
    private int floorNumber;
    private HallPanel hallPanel;
    private Display display;

    public Floor(int floorNumber, int topFloor) {
        this.floorNumber = floorNumber;
        this.hallPanel = new HallPanel(floorNumber, floorNumber == topFloor, floorNumber == 1);
        this.display = new Display();
    }

    public int getFloorNumber() { return floorNumber; }
    public HallPanel getHallPanel() { return hallPanel; }
    public Display getDisplay() { return display; }
}

