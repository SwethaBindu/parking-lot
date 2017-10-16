package parkinglot;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String[] pl=null;
		
		while(true){
			Scanner sc = new Scanner(System.in);
			String command = sc.nextLine();
			if(command.startsWith("create")){
				int n = Integer.parseInt(command.split(" ")[1]);
				
				pl = new String[n];
				
				System.out.println("Parking lot created with "+n+" slots");
				
			}else if(command.startsWith("park")){
				String carnum = command.split(" ")[1];
				boolean isParked = false;
				for(int i=0;i<pl.length;i++){
					if(pl[i] == null) {
						pl[i] = carnum;
						isParked = true;
						System.out.println("Car "+carnum+" is parked at "+(i+1)+" slot");
						break;
					}
				}
				
				if(!isParked){
					System.out.println("Parking lot is full");
				}
			}else if(command.startsWith("release")){
				String carnum = command.split(" ")[1];
				for(int i=0;i<pl.length;i++){
					if(carnum.equals(pl[i])){
						pl[i]=null;
						System.out.println("Car "+carnum+" is released, slot "+(i+1)+" is free");
						break;
					}
				}
			}else if(command.equals("exit")){
				break;
			}else{
				System.out.println("Invalid command received, Get lost !!");
			}
		}

	}

}
