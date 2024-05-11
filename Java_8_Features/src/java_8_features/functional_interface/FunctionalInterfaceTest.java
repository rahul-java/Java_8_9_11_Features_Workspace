package java_8_features.functional_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		
		//Supplier : Do not take any arguments, returns value and method : get()
		Supplier<String> s=()->{
			System.out.println("Supplier");
			return "Hello";
		};
		
		String res = s.get();
		System.out.println("Supplier :"+res);
		
		//Consumer : take arguments, returns nothing and method : accept();
		Consumer<String> c=(name)->{
			System.out.println("Consumer :"+name);
		};
		
		c.accept("Rahul");
		
		//Function : take arguments, returns value and method : apply();
		Function<Integer, String> f=(n)->{
			System.out.println("Function :: "+n);
			return "Square is "+n*n;
		};
		String res2 = f.apply(5);
		System.out.println("Function :"+res2);
		
		
		
		
	}
}
