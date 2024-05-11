package java_8_features.interfaces;

public class TestImpl2 implements Test {

	@Override
	public void display() {

		System.out.println("TestImpl2.display()");
	}

	@Override
	public void subtract() {
		System.out.println("TestImpl2.subtract()");
		//Test.super.subtract();
	}
	
	public void abcd() {
		Test.super.subtract();
	}
	
	public static void main(String[] args) {
		System.out.println("TestImpl2.main()");
		TestImpl2 obj = new TestImpl2();
		obj.subtract();
		obj.abcd();
	}
}
