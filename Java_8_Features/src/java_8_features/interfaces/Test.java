package java_8_features.interfaces;

public interface Test {

	//abstract method
	public void display(); 
	
	//non-abstract method
	//default method
	default void show() {
		System.out.println("Test.show()");
	}
	
	//non-abstract method
	//static method
	static void add() {
		System.out.println("Test.add()");
	}
	
	//in private method it show compilation error
	//we can not add private methods inside interface in java 8
	/*private void add1() {
		System.out.println("Test.add()");
	}*/
	
	//default method in java 8 provides the backward compatibility
	default void subtract() {
		System.out.println("Test.subtract()");
	}
}
