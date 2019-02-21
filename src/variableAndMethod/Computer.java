package variableAndMethod;

public class Computer {//opening of Curly brace
	
	String model; //declared the variable
	int price;
	char quality;
	boolean madeInUsa;
	float review;
	
	
	public Computer() { //declaration of Constructor, this constructor name is default constructor
		System.out.println("We are describing computer here");
	}
	public Computer(String model) { // parameterized constructor
		this.model = model;
		System.out.println("We are describing computer here:  " +model);
	}
	public Computer(String model, int price, char quality, boolean madeInUsa, float review) { // parameterized constructor
		this.model = model;
		this.price = price;
		this.quality = quality;
		this.madeInUsa = madeInUsa;
		this.review = review;
		System.out.println("We are describing computer here:  " +model+ "  "+price+ "  "+quality+ "  "+madeInUsa+ "  "+review);
	}
	
	public void computerConfiguration() {//method implementation
		System.out.println("Computer configuration is: " +model+ "  " +price+ "  "+quality+ "  "+madeInUsa+"   "+review);
	}
	//public void computerInfo(); //method declaration
	
	//Decalre variable
// declare constructor
	// declare method or implement method
	
//between carly brace called Class body
}//closing of Curly brace
