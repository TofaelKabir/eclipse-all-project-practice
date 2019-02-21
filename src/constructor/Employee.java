package constructor;

public class Employee {
    //Variable declared
	int EmpID;//they are class variable as they are under a class
	public String FirstName; //variable declare
	String LastName;
	public char Sex;
	boolean USACitizen;
	//Constructor 1
	public Employee () {  //default or no argument constructor
		System.out.println("\nI am desribing one of our Employee\n"); //nextline character
	}
	//Constructor 2
	public Employee (int EmpID) { //parameterized constructor and constructor declared, local variable inside
		this.EmpID=EmpID; 
		System.out.println("His Employee Id is: "+EmpID);
	}
	//Constructor 3
		public Employee (String FirstNam, String LastNam) { //parameterized constructor
			this.FirstName=FirstNam; this.LastName=LastNam;
			System.out.println("Everyone call him by "+FirstName+" and his family name is "+LastName);
		}
	//Constructor 4
		public Employee (char Sex, int EmpId, boolean USACitizen, String LastNam) {
			this.EmpID=EmpId; this.LastName=LastNam; this.Sex=Sex; this.USACitizen=USACitizen; 
			System.out.println(Sex+"  "+EmpID+"  "+USACitizen+"  "+LastName);
				}
	//Constructor 5
		public Employee (int EmpID, String FirstNam, String LastNam, char Sex, boolean USACitizen) {
			this.EmpID=EmpID; this.FirstName=FirstNam; this.LastName=LastNam; this.Sex=Sex; this.USACitizen=USACitizen; 
			System.out.println(FirstName+"  "+EmpID+"  "+USACitizen+"  "+LastName+"  "+Sex);
				}
        public void empID(int empID){
			this.EmpID=empID;
		    System.out.println("His Employee ID is: "+empID);
		}
	}
