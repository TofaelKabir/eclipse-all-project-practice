package oopEncapsulation;

public class TestPhone {

	public static void main(String[] args) {
		Phone ph1 = new Phone(); //default constructor is initialize
		ph1.setName("iPhone");
		ph1.setPrice(800);
		ph1.setGrade('A');
		ph1.setMadeInUsa(false);
		
		System.out.println("Tofael's phone configuration: "+ph1.getName()+", price: "+ph1.getPrice()+", grade: "+ph1.getGrade()+", Made inUsa: "+ph1.isMadeInUsa());
		 
		Phone ph2 = new Phone();//default constructor is initialize
		ph2.setName("Samsung");
		ph2.setPrice(650);
		ph2.setGrade('A');
		ph2.setMadeInUsa(true);
		
		System.out.println("Hafiz's phone configuration: "+ph2.getName()+", price: "+ph2.getPrice()+", grade: "+ph2.getGrade()+", Made inUsa: "+ph2.isMadeInUsa());
        
		Phone ph3 = new Phone("Nokia", 450, 'B',true); //parameterized constructor initialize
		System.out.println("Salam's phone: "+ph3.getName()+" "+ph3.getPrice()+" "+ph3.getGrade()+" "+ph3.isMadeInUsa());
		
	}

}
