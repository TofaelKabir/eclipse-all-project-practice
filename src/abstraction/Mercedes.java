package abstraction;

public class Mercedes extends FlyingCar implements Car, ElectricCar {

	
	public void start() {
		System.out.println("Turn on by power button");
	}
    public void stop() {
		System.out.println("turn off by power button");
	}
    public void brake() {
		System.out.println("Automatic break");
	}
	public void battery() {
		System.out.println("Battery is really powerful");
	}
    public void size() {
		System.out.println("They plan for the best size");
	}
    public void shape() {
		System.out.println("spherical like saucer");
	}
    public void autopilot() {
		System.out.println("Your lab is really working on it");
	}

}
