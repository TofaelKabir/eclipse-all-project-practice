package variableInitialize2;

import variableDeclared2.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee(); //reference variable is created
		emp1.fullName = "Mr Shafi"; //variable is initialized
		emp1.empId = 5643;
		emp1.sex = 'M';
		emp1.fullTimeEmployee = false;
		
		emp1.empInfo();
		
		Employee emp2 = new Employee();
		emp2.fullName = "Ms.Promi";
		emp2.empId = 5678;
		emp2.sex = 'F';
		emp2.fullTimeEmployee = true;
		
		emp2.empInfo(); //method initialized
		

	}

}
