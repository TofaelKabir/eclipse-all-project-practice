package oopInheritance;

public class TestIphone {

	public static void main(String[] args) {
		Iphone2 i2 = new Iphone2();
		i2.map();
		
		Iphone4 i4 = new Iphone4();
		i4.mapDesign();
		i4.map();
		
		Iphone6 i6 = new Iphone6();
		i6.improvedMap();
		i6.mapDesign();
		i6.map();
		
		
		Iphone8 i8 = new Iphone8();
		i8.SmartMap();
		i8.improvedMap();
		i8.mapDesign();
		i8.map();
		
		Iphone3 i3 = new Iphone3();
		i3.noMap();
		i3.map();
	}
}
//Iphone8 is the super class
//Iphone 2, Iphone 4, Iphone 6 are sub class

// Iphone 2 - Iphone 3, Iphone 2 - Iphone 4, THIS IS CALLED hierarchical inheritance
//Iphone 2 - Iphone 4 - Iphone 6 - Iphone 8 -- MULTILEVEL INHERITANCE
// Iphone 6 - Iphone 8  ---SINGLE INHERITANCE

