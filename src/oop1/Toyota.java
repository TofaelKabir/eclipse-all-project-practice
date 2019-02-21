package oop1;

public class Toyota extends FlyingCar implements Car, ElectricCar{


	public void start() {
	System.out.println("We have to use key to start");	
	}

	public void stop() {
	System.out.println("We need turn off the engine by key");
	}

    public void wheel() {
	System.out.println("It has forward wheel drive");
	}
	
	public void gear() {
	System.out.println("Automatic gear");
	}

    public void battery() {
	System.out.println("They are improving battery");
	}

	public void flyingFeatures() {
	System.out.println("Our car can fly");
	}

	@Override
	public void fff() {
		// TODO Auto-generated method stub
		
	}
}
