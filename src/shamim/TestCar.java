package shamim;

public class TestCar {

	public static void main(String[] args) {
		
		Car shamimCar = new Car(); //constructor 1 is initialize
		shamimCar.displayCarModel("Honda");
		
		Car tofaelCar = new Car("Camry", "Toyota", 65); //constructor 2  is initialize	
        tofaelCar.displayCarModel("BMW");
        
        Car waridCar = new Car (true, "S3", "Tesla", 23, 'A');// constructor 4 is initialize
        
        Car ayatCar = new Car ("KittyHawk", 494, "FlyingCar", 'A'); //constructor 3 is initialized
        //yellow color in reference variable means this is not used yet
        
        Car prantiCar = new Car("civic", "Honda", 34); //constructor 2 is using
	}

}
