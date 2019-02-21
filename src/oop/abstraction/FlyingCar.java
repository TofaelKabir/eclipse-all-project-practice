package oop.abstraction;

public abstract class FlyingCar implements FlyingObject{
	public abstract void flyingFeatures();
	public void autopilot() {
    System.out.println("This car has auto pilot features");
	}

}
