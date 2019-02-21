package abstraction;

public abstract class FlyingCar implements Drone, FlyingObject {
	
	public abstract void autopilot (); //only abstract method is declared
	
	public void flyingFeatures () { //void method can be implemented in abstract class, but not in interface
		System.out.println("Flying car is a dream");
	}

}
