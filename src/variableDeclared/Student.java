package variableDeclared;

public class Student {
	String fullName; //variable declared
	int stId;
	double grade;
	char sex;
	boolean fullTime;
	
	public void stuInfo(){
		System.out.println("Student Information: "+fullName+"  "+stId+"  "+grade+"  "+sex+"  "+fullTime);
	}
	public static void stuEthnecity() {
		System.out.println("We keep the ethnecity secret");
	}

}
