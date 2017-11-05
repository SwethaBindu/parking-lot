package parkinglot.command;

public class CommandFactory {

	public static PlCommand create(String command) {
		switch(command) {
			case "create":
				return new CreateCommand();
			
			case "park":
				return new ParkCommand();
			
			case "release":
				return new ReleaseCommand();
				
		}
		
		return null;
	}
}
