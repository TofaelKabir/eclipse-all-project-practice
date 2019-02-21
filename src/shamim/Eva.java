package shamim;

public class Eva {
			String brand;
			String model;
			String operatingsystem;
			String processor;
			int price;
			String owner;
			
			
			public void eva() { //declared a method
				System.out.println("The Computer's configuration is as follows:"
						 +brand+" "+model+" " +operatingsystem+ " "+processor);
			}
			public String computerOwner() {
				return owner;
			}
			public void tofael() {//non static method/void method/no return method
				System.out.println("Price of MacBook air is: $" + price);
			}
            
			public void priyana() {//non static method
				System.out.println("My computer configuration is: " + processor+  " " +model);
			}
	public static void main(String[] args) {
		
		Eva myEva = new Eva(); //instance
		myEva.brand = ("Apple,");
		myEva.model = ("MacBook Pro,");
		myEva.operatingsystem = ("mac OS High Sierra,");
		myEva.processor = ("core i7,");
		myEva.price = 2500;
		
		Eva myPranti = new Eva();
		myPranti.processor = ("core i 7");
		
		
		myPranti.priyana();
		
		
		myEva.eva();
		myEva.tofael();
		myPranti.eva();
		
		myEva.computerOwner();
			
			System.out.println("Ibrahemm");
		
		}
}
