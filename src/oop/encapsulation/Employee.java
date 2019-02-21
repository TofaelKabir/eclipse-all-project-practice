package oop.encapsulation;

public class Employee {
	private String fullName;
	private int salary;
	private char sex;
	private boolean usaCitizen;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean isUsaCitizen() {
		return usaCitizen;
	}
	public void setUsaCitizen(boolean usaCitizen) {
		this.usaCitizen = usaCitizen;
	}
	

}
