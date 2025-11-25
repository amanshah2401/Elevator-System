package com.systemdesign.Elevator.System.model.button;

public abstract class Button {
    private boolean pressed = false;

    public void press() {
        pressed = true;
    }

    public void reset() {
        pressed = false;
    }

    public boolean isPressed() {
        return pressed;
    }
}

