package variableDeclared;

public class TestStudent {

	public static void main(String[] args) {
		Student st1 = new Student(); //instantiate the class
		st1.fullName = "Nishat Sultana";
		st1.stId = 6546;
		st1.grade = 3.456798;
		st1.sex = 'F';
		st1.fullTime = true;
		st1.stuInfo();
		
		Student.stuEthnecity();
		
		Student st2 = new Student();
		st2.fullName = "Tofael";
		st2.stId = 65236;
		st2.grade = 3.29;
		st2.sex = 'M';
		st2.fullTime = true;
		st2.stuInfo();
		
		
		
		

	}

}
