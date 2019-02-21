package variableAndMethod;

public class TestComputer {

	public static void main(String[] args) {
		Computer shohag = new Computer(); //initialization of constructor
		/*shohag.model = "HP"; //initialize variable
		shohag.price = 800;
		shohag.quality = 'B';
		shohag.madeInUsa = false;
		shohag.review = 2.5234f;*/
		
		shohag.computerConfiguration();
		
	    Computer sharif = new Computer("moy");
	    sharif.model = "Mac";
	    sharif.price = 1300;
	    sharif.quality = 'A';
	    sharif.madeInUsa = true;
	    sharif.review = 5.12345f;
	    
	    sharif.computerConfiguration(); //initializing the method
	    
	    Computer hafiz = new Computer("Dowel", 400, 'F', false, 4.564f);
	    hafiz.model = "Dell";
	    hafiz.price = 400;
	    hafiz.quality = 'F';
	    hafiz.madeInUsa = false;
	    hafiz.review = 4.564f;
	    
	    hafiz.computerConfiguration();
	    
	    Computer orfatt = new Computer("panasonic", 700, 'B', true, 3.9f); //initialization of parameterized constructor
	    //orfatt.model = "Asus";
	    orfatt.computerConfiguration();
	    
	}

}
