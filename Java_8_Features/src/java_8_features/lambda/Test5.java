package java_8_features.lambda;

@FunctionalInterface
public interface Test5 {

	//@FunctionalInterface is used to restrict the user, not to make more than 1 abstract methods in FunctionalInterface
	public String show();
	//public String add();
	
	default void m1() {
		System.out.println("Test5.m1()");
	}
	
	static void m2() {
		System.out.println("Test5.m2()");
	}
	
	default void n3() {
		System.out.println("Test5.n3()");
	}
}
