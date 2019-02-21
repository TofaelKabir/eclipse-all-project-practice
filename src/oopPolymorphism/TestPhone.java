package oopPolymorphism;

public class TestPhone {

	public static void main(String[] args) {
		Phone ph1 = new Phone();
		System.out.println("phone price: "+ph1.info(400, 500));
		Phone ph2 = new Phone();
		System.out.println("phone price: "+ph2.info(400, 500, 600));
		Phone ph3 = new Phone();
		System.out.println("phone price: "+ph3.info(400, 500, "750"));
		
		FuturePhone ph4 = new FuturePhone();
		System.out.println("Future phone price: "+ph4.info(400, 500));
		FuturePhone ph5 = new FuturePhone();
		System.out.println("Future price: "+ph5.info(400, 500, 600));
		FuturePhone ph6 = new FuturePhone();
		System.out.println("Future price: "+ph6.info(400, 500, "750"));


	}

}
