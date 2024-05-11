package java_8_features.lambda;

public class LambdaTest4 {
	public static void main(String[] args) {

		Test4 t=()->{
			System.out.println("Welcome to Lambda Expression");
			return "Bye";
		};
		String res = t.show();
		System.out.println(res);
		
	}

}
