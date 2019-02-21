package oop.abstraction;

public interface Car {//opening interface body
	public void start(); //declaration of method in interface
	public void stop() ;
	public void wheel();
	public void gear();
	
	
	public static void honk() {
	System.out.println("Hydrolic honk");	
	}
	}//closing of interface body
