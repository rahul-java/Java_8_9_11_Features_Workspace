package java_8_features.lambda;

public class LambdaTest {
	public static void main(String[] args) {
		//for implementing lambda , the interface must hve only 1 abstract method
		//Lambda correspond to an interface and specifically abstract method present in interface
		
		Test t=()-> {
			System.out.println("LambdaTest.main()");
		};
		t.display();
	}

}
