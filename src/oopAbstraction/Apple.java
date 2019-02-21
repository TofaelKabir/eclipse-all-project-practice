package oopAbstraction;

public class Apple extends Bose implements Phone { //here Apple class is a concrete class, because it extends abstract class
	                                               //and implement Interface
	public void retinaDisplay() { //method implemented, but no declaration possible
		System.out.println("Apple have the retina display technology");
	}
    public void talk() {
		System.out.println("The talking is crystal clear");
	}
    public void message() {
		System.out.println("We have imessage, which is very uncommon");
	}
    public void camera() {
		System.out.println("Pixel of our camera is very high ");
	}
    public void sound() {
		System.out.println("Our sound is very clear, best in the industry");
	}
    public void materials() {
		System.out.println("The materials for speakers are very expensive");
	}
    public void quality() {
		System.out.println("The quality of speakers of Bose are really excellent");
	}
	

}
