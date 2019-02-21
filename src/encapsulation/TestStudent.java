package encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setFirstName("Hafiz");
		st1.setStuId(234);
		st1.setSex('M');
		st1.setWeekendStudent(true);
		st1.setAge(27);
		System.out.println("The student information is: Name- "+st1.getFirstName()+", his ID: "+st1.getStuId()+", his gender: "+st1.getSex()+", Weekend Batch: "+st1.isWeekendStudent()+", his age "+st1.getAge());
       
		
		Student st2 = new Student();
		st2.setFirstName("Nazibah");
		st2.setStuId(284);
		st2.setSex('F');
		st2.setWeekendStudent(false);
		st2.setAge(23);
		System.out.println("The student information is: Name- "+st2.getFirstName()+", her ID: "+st2.getStuId()+", her gender: "+st2.getSex()+", Weekend Batch: "+st2.isWeekendStudent()+", hes age "+st2.getAge());

	}

}
