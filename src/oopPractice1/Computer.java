package oopPractice1;

public interface Computer {
	public void displayPrice();
	public void displayModel();
	public static void displayComputerConfiguration() {
	System.out.println("What is the your computer configuration?");
	}
	public default void displayOperatingSystem() {
	System.out.println("Operating system must be speedy");
	}
  }
