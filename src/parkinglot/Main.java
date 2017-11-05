package parkinglot;

import java.util.Scanner;

import parkinglot.command.CommandFactory;
import parkinglot.command.PlCommand;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ParkingLot pl = new ParkingLot();
		
		while(true){
			Scanner sc = new Scanner(System.in);
			String commandLine = sc.nextLine();
			String command = commandLine.split(" ")[0];
			
			PlCommand plCommand = CommandFactory.create(command);
			if(plCommand == null) {
				System.out.println("Invalid command received, try again !!");
			} else {
				plCommand.process(commandLine, pl);
			}
		}

	}

}
