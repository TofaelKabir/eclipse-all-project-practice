package encapsulation;

public class Student {
	private String firstName;
	private int StuId;
	private char sex;
	private boolean weekendStudent;
	public int age;
	/*public Student() {
		System.out.println("default constructor");
	}*/
	public void setFirstName(String firstName) {this.firstName = firstName;}
	public String getFirstName() {
		return firstName;}
	public void setStuId(int stuId) {
		StuId = stuId;
	}
	public int getStuId() {
		return StuId;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public char getSex() {
		return sex;
	}
	public void setWeekendStudent(boolean weekendStudent) {
		this.weekendStudent = weekendStudent;
	}
	public boolean isWeekendStudent() {
		return weekendStudent;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
