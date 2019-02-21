package oop1;

public class Mercedes implements Car, ElectricCar {

	public void start() {
	System.out.println("It has a power button");	
	}

	public void stop() {
	System.out.println("We need to press the power button to stop");	
	}

	public void wheel() {
	System.out.println("Four wheel drive");	
	}
	
	public void battery() {
	System.out.println("Battery is charged by electricity");
	}

}
