package java_8_features.interfaces;

public class TestImpl3 implements Test {

	@Override
	public void display() {

		System.out.println("TestImpl3.display()");
	}
	
	static void add() {
		System.out.println("TestImpl3.add()");
	}

	public static void main(String[] args) {
		System.out.println("TestImpl3.main()");
		//to access static method present in interface
		//interfaceName.methodName()
		Test.add();
		TestImpl3.add();	
		
	}
}
