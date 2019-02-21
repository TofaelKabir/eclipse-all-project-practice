package abstraction;

public interface Car {
	
	public void start (); //in interface the methods are abstract and can be declared, not implemented
	
	public void stop (); //only default and static method can be implemented 
	
	public void brake ();
	
	public default void honk () { //implemented
		System.out.println("The honk is hydrolic for everyone");
    	}
	public static void gear () {//implemented
		System.out.println("Gear is automatic for all");
	}
	

}
