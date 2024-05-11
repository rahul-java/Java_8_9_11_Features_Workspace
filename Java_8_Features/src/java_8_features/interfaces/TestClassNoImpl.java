package java_8_features.interfaces;

public class TestClassNoImpl {

	static void add() {
		System.out.println("TestClassNoImpl.add()");
	}
	
	public static void main(String[] args) {
		
		TestClassNoImpl obj = new TestClassNoImpl();
		System.out.println("============obj.add()===========");
		obj.add();
		System.out.println("=========obj=null :: obj.add()============");
		obj=null;
		obj.add();
		System.out.println("==========TestClassNoImpl.add()==============");
		TestClassNoImpl.add();
		System.out.println("=========Test.add()=============");
		Test.add();
		
		//O/P
		      /*============obj.add()===========
				TestClassNoImpl.add()
				=========obj=null :: obj.add()============
				TestClassNoImpl.add()
				==========TestClassNoImpl.add()==============
				TestClassNoImpl.add()
				=========Test.add()=============
				Test.add()*/
		
		
	}

}
