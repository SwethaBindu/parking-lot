package parkinglot.command;

import parkinglot.ParkingLot;

public class ReleaseCommand implements PlCommand{
	@Override
	public void process(String command, ParkingLot pl){
     String carnum = command.split(" ")[1];
		
		pl.release(carnum);
	}

	}

