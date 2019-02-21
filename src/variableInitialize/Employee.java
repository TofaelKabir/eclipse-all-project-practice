package variableInitialize;

public class Employee {
	String employeeName = "Nishat";
	int employeeID = 74545894;
	char employeeGrade = 'D';
	boolean usCitizen = false;
	
	public  void employeeInfo () {
		System.out.println("the employee name is "+employeeName+"the employee ID IS "+employeeID+"THE EMPLOYEE GRADE IS"+employeeGrade+usCitizen);
	}
	
			

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.employeeInfo();
	}

}
