package com.systemdesign.Elevator.System.model.panel;

import com.systemdesign.Elevator.System.enums.Direction;
import com.systemdesign.Elevator.System.model.button.HallButton;

public class HallPanel {
    private HallButton upButton;
    private HallButton downButton;

    public HallPanel(int floorNumber, boolean isTop, boolean isBottom) {
        if (!isTop)   upButton = new HallButton(floorNumber, Direction.UP);
        if (!isBottom) downButton = new HallButton(floorNumber, Direction.DOWN);
    }

    public HallButton getUpButton() { return upButton; }
    public HallButton getDownButton() { return downButton; }
}

