package java_8_features.lambda;

public class LambdaTest2 {
	public static void main(String[] args) {

		String name="Rahul";
		//Lambda Expression
		Test2 t=(n)-> {
			System.out.println("LambdaTest2.main() :: "+n);
			return "Hello, "+n;
		};
		String res = t.show(name);
		System.out.println(res);
		
		//Lambda Expression
		Test2 t2=(n)->"Welcome, "+n;
		String res2 = t2.show(name);
		System.out.println(res2);
		
	}

}
