package activities;

public class Car {
	String color;
	String transmission;
	int make;
	int doors;
	int tyres;
	
	public Car() {
		this.tyres=4;
		this.doors=4;
	}
	
	public void displayCharacteristics() {
		System.out.println("color:"+color);
		System.out.println("Transmission:"+ transmission);
		System.out.println("Make:"+make);
		System.out.println("Doors:"+doors);
		System.out.println("tyres:"+tyres);
	}
	public void accelarate() {
		System.out.println("Car is moving forward.");
		
	}
	public void brake() {
		System.out.println("Car has stopped.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw=new Car();
		bmw.color="Black";
		bmw.make=2014;
		bmw.transmission="Manual";
		bmw.displayCharacteristics();
		bmw.accelarate();
		bmw.brake();
	

	}

}
