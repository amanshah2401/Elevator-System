package com.systemdesign.Elevator.System;

import com.systemdesign.Elevator.System.enums.Direction;
import com.systemdesign.Elevator.System.model.Building;
import com.systemdesign.Elevator.System.model.ElevatorCar;
import com.systemdesign.Elevator.System.model.ElevatorSystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElevatorSystemApplication {

	public static void main(String[] args) {

        SpringApplication.run(ElevatorSystemApplication.class, args);
        Building building = new Building(10, 2);
        ElevatorSystem system = new ElevatorSystem(building);

        // User presses UP on floor 3
        system.requestElevator(3, Direction.UP);

        // User inside elevator presses floor 9
        ElevatorCar elevator = building.getElevators().get(0);
        elevator.getPanel().getEmergencyButton().setElevatorCar(elevator);
        elevator.addRequest(9);
        elevator.move();

        // Emergency test
        elevator.getPanel().getEmergencyButton().pressEmergency();
	}

}
