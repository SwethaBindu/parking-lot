package parkinglot.command;

import parkinglot.ParkingLot;

public class CreateCommand implements PlCommand {

	@Override
	public void process(String command, ParkingLot pl) {
		int n = Integer.parseInt(command.split(" ")[1]);
		pl.create(n);
	}

}
