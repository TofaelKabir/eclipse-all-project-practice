package abstraction;

public class Toyota extends FlyingCar implements Car, ElectricCar { //all are inherited
    //class can extends abstract class but not interface
	//here Toyota is a concrete class
	//only one extension (abstract class)
	//but multiple implements (interface) possible
	public void color() {
		System.out.println("color is beautiful");
	}
	public void start() { //method implemented here from Car interface
		System.out.println("We will use key to ignite the car");
	}
    public void stop() { //method implemented here from Car interface
		System.out.println("We will use key to turn off the car");
	}
    public void brake() { //method implemented here from Car interface
		System.out.println("Our brake is mnaual");
	}
	public void autopilot() { //method implemented here from abstract class
		System.out.println("This features is coming from flying car");
	}
	public void battery() { //method implemented here from ElectricCar interface
		System.out.println("Battery is improving for Toyota but not improving much");
	}
	public void size() { //method implemented here from Drone interface
		System.out.println("The drone should be small in size to fly well");
	}
	public void shape() { //method implemented here from FlyingObject interface
		System.out.println( "no square shape, speed will be down, need spherical shape");
	}

}
