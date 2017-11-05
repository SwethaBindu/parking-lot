package parkinglot.command;

import parkinglot.ParkingLot;

public interface PlCommand {

	public void process(String command, ParkingLot pl);
}
