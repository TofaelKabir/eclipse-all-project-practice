package oop.abstraction;

public class BMW extends SpaceShip implements Car, ElectricCar {

	public void start() {
	System.out.println("Remote start features");	
	}

	public void stop() {
	System.out.println("Hydrolic break system");
	}

	public void wheel() {
	System.out.println("Four wheeel drive");	
	}

	public void gear() {
	System.out.println("Automatic gear");
	}

	public void engineRunByBattery() {
	System.out.println("Solar panel gives enough power, so lets build electri car");
	}

	public void flyingSpeed() {
	System.out.println("The speed for flying speed is very high");
	}

}
