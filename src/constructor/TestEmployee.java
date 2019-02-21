package constructor;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp1 = new Employee(); //constructor 1 is initialize
		emp1.empID(2134);
		Employee emp2 = new Employee("Mohammad", "Sharkar"); //constructor 2 is initialize 
		Employee emp3 = new Employee('M', 2188458, false, "Sharkar"); //constructor 4 is initialize
		//Employee emp4 = new Employee("MOHAMMAD", 2188458, false, "Sharkar", 'F'); //constructor 3 is initialize
		Employee emp5 = new Employee("Shamim", "Rahman"); //constructor 3 is initialize
		Employee emp6 = new Employee('M', 23456, true, "Chowdhury"); //constructor 4 is initialize
		Employee emp7 = new Employee("Ikramul", "Ghani"); //constructor 3 is initialize
		Employee emp8 = new Employee(217652, "Alif", "Rahman", 'F', true); //constructor 5 is initialize
		Employee emp9 = new Employee (23476);//constructor 2 is initialize
		Employee emp10 = new Employee(2188752, "Nishat", "Sultana", 'F', false); //constructor 5 is initialize
	}

}
