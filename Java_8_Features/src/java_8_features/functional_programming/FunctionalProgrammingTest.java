package java_8_features.functional_programming;

public class FunctionalProgrammingTest {

	//main advantage of Lambda Expression is Functional Programming.
	
	public void run(Test t) {
		System.out.println("FunctionalProgrammingTest.run()");
		t.display();
	}
	public static void main(String[] args) {
		
		//Lambda
		Test t=()->{
			System.out.println("FunctionalProgrammingTest.main()");
		};
		t.display();
		System.out.println("------------------------------------------");
		//here t has the functionality of abstract method implementation
		//and passing this functionality as a method argument is called Functional Programming
		FunctionalProgrammingTest obj = new FunctionalProgrammingTest();
		obj.run(t);
		System.out.println("---------------------------------------------");
		obj.run(()->System.out.println("Functional Programming"));
		
		
	}
}
