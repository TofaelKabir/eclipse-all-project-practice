package constructor2;

public class TestComputer {

	public static void main(String[] args) {
		Computer cp1 = new Computer(); //constructor 1 is initialize
		
		Computer cp2 = new Computer("Mac", 1300, 'C', false);
		
		Computer cp3 = new Computer("HP", 800, 'B', true);
		
		Computer cp4 = new Computer("Dell", 1000, 'A', false);
		
		Computer cp5 = new Computer("Lenovo", 700, 'D', true);
		
		Computer.computerColor();

	}

}
