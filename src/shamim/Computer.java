package shamim;

public class Computer {

		//public String brand = "Apple";
		String brand;
		String model;
		String operatingsystem;
		String processor ="intel core i7"; //variable initialization
		int price =2500;
		
		
		public void displayComputerConfiguration() { //declared a method
			System.out.println("The Computer's configuration is as follows:"
					 +brand+" "+model+" " +operatingsystem+ " "+processor);
		}
		
		public void displayPrice() {//non static method
			System.out.println("Price of MacBook Pro is: $" + price);
		}
			 
		
	}

