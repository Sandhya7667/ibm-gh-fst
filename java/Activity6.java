import java.util.ArrayList;
import java.util.Date;
import java.util.List;


class Plane{
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTakeOf;
	private Date lastTimeLanded;


public Plane(int maxPassengers) {
	this.maxPassengers=maxPassengers;
	this.passengers=new ArrayList<>();
	
}
public void onboard(String passengerName) {
	if(passengers.size() <= maxPassengers) {
		this.passengers.add(passengerName);
	}else {
		System.out.println("plane is full");
	}
}

public Date takeOff() {
	this.lastTimeTakeOf=new Date();
	return lastTimeTakeOf;
}
public void land() {
	this.lastTimeLanded =new Date();
	this.passengers.clear();
}

public List<String> getPassengers(){
	return passengers;
}
}
public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		
		Plane plane = new Plane(10);
		
		plane.onboard("sai");
		plane.onboard("shri");
		plane.onboard("shruti");
		
		System.out.println("people on the plane: "+plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("people on the plane after landing: "+plane.getPassengers());
		}

}
