package oopPolymorphism;

public class FuturePhone {
	public int info (int price1, int price2) { //same method name, same signature but the logic is different
		int total = price1 + price2 + 50;
		return total;
	}
	public int info (int price1, int price2, int price3) {
		int total = price1+price2 + price3 - 59 ;
		return total;
	}
	public int info (int price1, int price2, String name) {
		int value = Integer.parseInt(name);
		int total = price1+price2 + value + 67;
		return total;
	}

}
