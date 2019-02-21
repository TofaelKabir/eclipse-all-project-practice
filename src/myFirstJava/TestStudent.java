package myFirstJava;

public class TestStudent {

	public static void main(String[] args) {
		
		Student student1 = new Student ();
		student1.firstName = "Hafiz"; //variable initialized
		student1.studentId = 3678;
		student1.grade = 'A';
		student1.bdCitizen = true;
		
		student1.studentInformation();
		student1.goodStudent();
		
		Student student2 = new Student();
		student2.firstName = "Hasib";
		student2.studentId = 3781;
		student2.grade ='A';
		student2.bdCitizen =false;
		
		student2.studentInformation();
		student2.goodStudent();

	}

}
