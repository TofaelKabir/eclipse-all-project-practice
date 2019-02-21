package shamim;

public class  Car {	
	public int CarID; // Class variable
	public String CarModel; //variable declare
	String CarMake; //public likhi nai but ok without public
	public int ColorCode;
	char CarClass;
	boolean ElectricCar;

	//Default Constructor or no argument constructor
	public Car () {  //constructor declared
		System.out.println("\n This person dosen't own a car \n"); //nextline character
	}
	//Constructor 2 (parameterized constructor)
	public Car (String CarMod, String CarMake, int ColorCode) { //inside parenthese, they are called local variable
		this.CarModel=CarMod; 
		this.CarMake=CarMake; 
		this.ColorCode=ColorCode;
		System.out.println(CarModel+"  "+CarMake+ " "+ElectricCar+"  "+ColorCode+" No CarID found");
	}
    //Constructor 3
	public Car (String CarModel,int CarID, String CarMake, char CarClass) {
		this.CarID=CarID; 
		this.CarModel=CarModel;
		this.CarMake=CarMake;
		this.CarClass=CarClass;
	    System.out.println("CarNo: "+CarID+"  "+"CarName: "+CarMake+" , "+CarModel);
	}
    //Constructor 4
	public Car (boolean ElectricC, String CarModel, String CarMake, int ColorCode, char CarClass) {
		this.ElectricCar = ElectricC ; 
		this.CarModel=CarModel; 
		this.CarMake=CarMake; 
		this.ColorCode=ColorCode;
		this.CarClass=CarClass;
	    System.out.println(ElectricCar+"  "+CarModel+"  "+CarMake+"  "+ColorCode+"  "+CarClass);
	}
    public void displayCarModel(String CarMod){
	    this.CarModel=CarMod;
	    System.out.println("The Model of this car is: "+CarMod);
	}
}