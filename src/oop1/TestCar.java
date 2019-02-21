package oop1;

public class TestCar {

	public static void main(String[] args) {
	
		
		
		
		Car car1 = new Toyota();
		car1.start();
		car1.stop();
		car1.wheel();
		car1.dd();
		Car.gear();
	
	
		
		Toyota camry = new Toyota();
		//camry.start();
		camry.gear();
		camry.battery();
		camry.flyingFeatures();
		camry.autoPilot();
		
		
		Car car2 = new Mercedes(); //mercedes type object from car interface
		car2.start();
		car2.stop();
		car2.wheel();
		
		Mercedes series5 = new Mercedes();
		series5.battery();
		
		

	}

}
