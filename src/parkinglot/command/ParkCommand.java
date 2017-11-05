package parkinglot.command;

import parkinglot.ParkingLot;

public class ParkCommand implements PlCommand{

	@Override
	public void process(String command, ParkingLot pl) {
		String carnum = command.split(" ")[1];
		
		pl.park(carnum);
	}

}
