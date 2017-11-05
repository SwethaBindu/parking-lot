package parkinglot;

public class ParkingLot {

	private String[] slots;
	
	public void create(int n) {
		slots = new String[n];
		
		System.out.println("Parking lot created with "+n+" slots");
	}
	
	public void park(String carnum) {
		boolean isParked = false;
		for(int i=0;i<slots.length;i++){
			if(slots[i] == null) {
				slots[i] = carnum;
				isParked = true;
				System.out.println("Car "+carnum+" is parked at "+(i+1)+" slot");
				break;
			}
		}
		
		if(!isParked){
			System.out.println("Parking lot is full");
		}
	}
	
	public void release(String carnum) {
		for(int i=0;i<slots.length;i++){
			if(carnum.equals(slots[i])){
				slots[i]=null;
				System.out.println("Car "+carnum+" is released, slot "+(i+1)+" is free");
				break;
			}
		}
	}
}
