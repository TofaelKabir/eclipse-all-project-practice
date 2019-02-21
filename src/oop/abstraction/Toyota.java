package oop.abstraction;

public class Toyota extends FlyingCar implements Car, ElectricCar {

	public void start() {
	System.out.println("Strat the car");
	}
    public void stop() {
    System.out.println("Press the break to stop the car");
	}
	public void wheel() {
	System.out.println("Car shouls run on wheel");
	}
    public void gear() {
    System.out.println("Gear should move to D to run");
	}
    public void color() {
    System.out.println("My car color is black");
    }
    public void flyingFeatures() {
    System.out.println("It has flying features");
    }
	public void engineRunByBattery() {
	System.out.println("Toyota also has battery car");
	}
	public void size() {
	System.out.println("The size is small to take less space");
	}
	public void speed() {
	System.out.println("There speed is super high");
	}
}
