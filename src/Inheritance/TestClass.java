package Inheritance;

public class TestClass {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.methodA();
		classA.methodC();
		
		
		ClassB classB = new ClassB();
		classB.methodB();
		classB.methodA();
		classB.methodC();
		
		ClassC classC = new ClassC();
		classC.methodC();
		
		ClassD classD = new ClassD();
		classD.methodD();
		classD.methodC();
		
		ClassE classE = new ClassE();
		classE.methodE();
		classE.methodC();
		
		
		
		
		
	}

}
