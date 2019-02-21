package variableInitialize;

public class House {
	String houseName = "Via57"; //variable initialize
	int houseNumber = 625;
	char direction = 'W';
	boolean eastSide = false;
	
	
	public void houseInfo() {
		System.out.println("My house information: "+houseName+" "+houseNumber+direction+" 57 st, Apt 2952. are we in east side? Ans: "+eastSide);
	}
	
	public static void main(String[] args) {
		House house = new House ();
		house.houseInfo();

	}

}
