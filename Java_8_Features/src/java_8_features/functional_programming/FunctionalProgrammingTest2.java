package java_8_features.functional_programming;

public class FunctionalProgrammingTest2 {

	//main advantage of Lambda Expression is Functional Programming.
	
	public void run(Test2 t) {
		System.out.println("FunctionalProgrammingTest.run()");
		int i = t.add(5,5);
		System.out.println(i);
	}
	public static void main(String[] args) {
		
		//Lambda
		Test2 t=(x,y)->{
			System.out.println("FunctionalProgrammingTest2.main()");
			return x+y;
		};
		int i = t.add(5,5);
		System.out.println(i);
		System.out.println("-----------------------------------------------");
		//here t has the functionality of abstract method implementation
		//and passing this functionality as a method argument is called Functional Programming
		FunctionalProgrammingTest2 obj = new FunctionalProgrammingTest2();
		obj.run(t);
		System.out.println("--------------------------------------------------");
		obj.run((x,y)->{
			System.out.println("Functional Programming");
			return x*x+y*y;
		});
		
		
	}
}
