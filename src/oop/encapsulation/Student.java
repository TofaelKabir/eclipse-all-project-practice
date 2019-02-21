package oop.encapsulation;

public class Student {
	private String stName;
	private int stId;
	private char grade;
	public String dob;
	private boolean vegetarian;
	public String sex;
	
	
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	
	private void demoOfPrivate() { //how to use private, not part of it
		System.out.println("This is a hidden criteria");
	}
	public void getSex() {
		demoOfPrivate();
	}
	

}
