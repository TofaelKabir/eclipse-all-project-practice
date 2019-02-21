package oop1;

public interface Car { //in interface method can't be implemented, only declaration
	public void start();  //declaration of method
	public void stop(); //also called abstarct method
	public void wheel();
	public static void gear() {
		System.out.println("yetwgd");
	}
	public default void dd() {
		System.out.println("hgxhgdsvgxv");
	}
}
//Interface is a roadmap of actual class