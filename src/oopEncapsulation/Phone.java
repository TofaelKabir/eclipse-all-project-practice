package oopEncapsulation;

public class Phone {
	
	private String name;
	private int price;
	private char grade;
	private boolean madeInUsa;
	
	
	public Phone() { //default constructor declared
		System.out.println("this is from default constructor");
	}
	
	public Phone(String name, int price, char grade, boolean madeInUsa) { //parameterized constructor
		this.name = name;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public boolean isMadeInUsa() {
		return madeInUsa;
	}
	public void setMadeInUsa(boolean madeInUsa) {
		this.madeInUsa = madeInUsa;
	}
}
