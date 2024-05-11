package java_8_features.interfaces;

public class TestImpl implements Test {

	@Override
	public void display() {

		System.out.println("TestImpl.display()");
	}

	//how to acces the default method of interface
	public void abc() {
		//interfaceName.super.methodName()
		Test.super.subtract();
	}
	
	public static void main(String[] args) {
		System.out.println("TestImpl.main()");
		TestImpl obj = new TestImpl();
		obj.abc();
	}
}
