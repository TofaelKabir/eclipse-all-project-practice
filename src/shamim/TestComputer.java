package shamim;

public class TestComputer {

		public static void main(String[] args) {
			
			Computer myComputer = new Computer(); //instance
			myComputer.brand = ("Apple");
			myComputer.model = ("MacBook Pro");
			myComputer.operatingsystem = ("mac OS High Sierra,");
			myComputer.price = 2500;
			
			myComputer.displayComputerConfiguration();
			myComputer.displayPrice();
			
			}
}