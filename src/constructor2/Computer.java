package constructor2;

public class Computer {
	String name; //variable declared
	int price; //these variables are called class variable or global variable
	char grade;
	boolean madeInUsa;
	//constructor 1
	public Computer	() { //default constructor , no argument constructor
		System.out.println("this is from default constructor");
	}
	//constructor 2
	public Computer	(String name, int price, char grade, boolean madeInUsa) { //parameterized constructor, the variables are called 
		      this.name = name;                                               // local variable
		      this.price = price;
		      this.grade = grade;
		      this.madeInUsa =madeInUsa;
		System.out.println("Computer Info: "+name+" "+price+" "+grade+" "+madeInUsa);
	}
	//method1
	public static void computerColor() {
		System.out.println("All the computers have variety of colors");
	}

}
