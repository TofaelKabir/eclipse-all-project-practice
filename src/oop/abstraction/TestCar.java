package oop.abstraction;

public class TestCar {

	public static void main(String[] args) {
   
	Car car = new Toyota();
    car.start(); //how could they become abstract method
    car.stop();
    car.wheel();
    car.gear();
    
    Car.honk();
    
    ElectricCar ec = new Toyota();
    ec.engineRunByBattery();
   
	Toyota camry = new Toyota();
	camry.start();
	camry.stop();
	camry.wheel();
	camry.gear();
	camry.color();
	camry.engineRunByBattery();
	camry.autopilot();
	camry.flyingFeatures();
	
	BMW series5 = new BMW();
	series5.start();
	series5.stop();
	series5.wheel();
	series5.gear();
	series5.engineRunByBattery();
	series5.flyingSpeed();
	series5.flyingStyle();
	
	FlyingCar kittyHawk = new Toyota();
	kittyHawk.flyingFeatures();
	kittyHawk.autopilot();
	kittyHawk.size();
	kittyHawk.speed();



	
	SpaceShip bhashani = new BMW();
	bhashani.flyingSpeed();
	bhashani.flyingStyle();

	
	}
}
