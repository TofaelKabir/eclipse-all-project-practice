package variableInitialize;

public class Student { //opening of class body
	String studentName = "Nabeeha"; //variable initialize
	int studentID = 2878276;
	char studentGrade = 'A';
	boolean usCitizen = false;
	

	public void studentInformation() { //method implemented
		System.out.println("The student name is "+studentName+", The student ID is "+ studentID +" , Student Grade is "+ studentGrade+ ", UScitizen "+usCitizen);
	}
	public void studentData() { //opening of method body
		System.out.println("She is my daughter"); 
	}//closing of method body
	public static void main(String[] args) { //main method
		Student stu = new Student ();
		stu.studentInformation ();
		stu.studentData();
	

	}

}//closing of class body
