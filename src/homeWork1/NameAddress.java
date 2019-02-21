package homeWork1;

public class NameAddress {
	String fullName = "Mohammad Tofael Kabir Sharkar";
	int houseNumber = 625;
	char direction = 'W';
	int aptNumber = 2952;
	int stNumber = 57;
	String state = "NY";
	int zipCode = 10019;
	
public void nameAndAddress() {
	System.out.println(fullName+",  "+houseNumber+direction+ " "+stNumber+"st, Apt "+aptNumber+", "+state+ " "+zipCode);
    }

public static void main(String[] args) {
    NameAddress nd = new NameAddress();
	nd.nameAndAddress();
    }
}
