package practical11_2;

public class Bike implements Vehicle{
	
	private String veh;
	
	public void startJourney() {
		
		System.out.println("Journey Started....");
		move(veh);
	}
	
	public void move(String veh) {
		System.out.println("Bike is Moving....");
		System.out.println("Vehicle is " + veh);
	}

	public Bike(String veh) {
		super();
		this.veh = veh;
	}
	
	public Bike() {
		super();
	}

	public String getVeh() {
		return veh;
	}

	public void setVeh(String veh) {
		this.veh = veh;
	}
}

