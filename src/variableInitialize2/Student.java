package variableInitialize2;

public class Student {
    public String stNickName; //variable declared
	public String stFullName = "Mohammad Sharkar"; //variable initialized, String is always start with Caps like, all other variable in small letter 
	public int stId = 2345;
	public char sex = 'M';
	public boolean usCitizen = false; //true and false always in small letter
	
	public void studentinfo() { // Method implemented, opening of method body,
	System.out.println("Student Information: "+stFullName+" "+stId+" "+sex+" "+usCitizen);	//concatenation
	} //closing of method body
	
	public static void main(String[] args) {
		Student st = new Student ();
		st.studentinfo(); //method initialize
		//st.stNickName = "tofael"; //variable initialized
	}
}
