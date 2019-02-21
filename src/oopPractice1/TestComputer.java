package oopPractice1;

public class TestComputer {

	public static void main(String[] args) {
		Computer computer = new Mac();
		computer.displayModel();
		computer.displayPrice();
		computer.displayOperatingSystem();
		Computer.displayComputerConfiguration();
		
		Mac air = new Mac();
		air.displayColor();
		air.displayIntelligence();
		air.displayRam();
		
		SuperNova s3 = new Mac();
		s3.displayIntelligence();
		s3.displayRam();
		
		
		

	}

}
