package java_8_features.lambda;

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
}
