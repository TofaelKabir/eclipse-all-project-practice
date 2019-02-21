package oop.encapsulation;

public class TestStudent {
	public static void main(String[] args) {
	Student st1 = new Student();
	st1.setStName("Mohammad Sharkar");
	st1.setStId(483);
	st1.setDob("12-12-76");
	st1.setGrade('A');
	st1.setVegetarian(false);
	System.out.println(st1.getStName()+ "    " +st1.getStId()+"    "+st1.getDob()+"    "+st1.getGrade()+ "    "+st1.isVegetarian());
	
	Student st2 = new Student();
	st2.setStName("Ikram Ghani");
	st2.setStId(476);
	st2.dob=("12-12-79"); //why? because this is public, we can access it by calling variable.
	st2.setGrade('A');
	st2.setVegetarian(true);
	
	System.out.println(st2.getStName()+ "    " +st2.getStId()+"    "+st2.dob+"    "+st2.getGrade()+ "    "+st2.isVegetarian());
	
	st2.getSex(); //how to call a private method
 }
}
