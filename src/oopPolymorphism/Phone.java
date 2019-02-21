package oopPolymorphism;

public class Phone {
	
	public int info (int price1, int price2) { //same method name but different signature(parameter)
		int total = price1 + price2;
		return total;
	}
	public int info (int price1, int price2, int price3) {
		int total = price1+price2 + price3;
		return total;
	}
	public int info (int price1, int price2, String name) {
		int value = Integer.parseInt(name);
		int total = price1+price2 + value;
		return total;
	}

} 
