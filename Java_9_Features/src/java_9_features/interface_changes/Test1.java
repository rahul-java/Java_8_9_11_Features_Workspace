package java_9_features.interfaces;

public class Test1 implements IDisplay {

	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		test1.add1();
		test1.add2();
	}
	
	@Override
	public void add2() {
		// TODO Auto-generated method stub
		IDisplay.super.add2();
		
		int x=10*20;
		System.out.println("x = "+x);
	}
	
	@Override
	public void add1() {
		// TODO Auto-generated method stub
		IDisplay.super.add1();
		int z=100-100;
		System.out.println("Z value is : "+z);
	}
}
