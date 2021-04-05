package practical11_2;

public class Car implements Vehicle{
	
	private String veh;
	
	public void startJourney() {
		
		System.out.println("Journey Started....");
		move(veh);
	}
	
	public void move(String veh) {
		System.out.println(veh + " is Moving....");
		System.out.println("Vehicle is " + veh);
	}

	public Car(String veh) {
		super();
		this.veh = veh;
	}
	
	public Car() {
		super();
	}

	public String getVeh() {
		return veh;
	}

	public void setVeh(String veh) {
		this.veh = veh;
	}
}
