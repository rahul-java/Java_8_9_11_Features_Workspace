package java_8_features.collection_inhancement;

public class MethodReferenceTest {

	public MethodReferenceTest(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("MethodReferenceTest.MethodReferenceTest()"+i);
	}
	
	public static void main(String[] args) {
		
		//static method reference
		System.out.println("==========static method reference===========");
		Test test=(n)->MethodReferenceTest.show(n); //lambda exp
		Test test1=MethodReferenceTest::show;  //method reference
		test.display(10);
		test1.display(100);
		
		//instance method reference
		System.out.println("===================instance method reference=============");
		MethodReferenceTest obj=new MethodReferenceTest(10);
		
		Test test2=(n)->obj.add(n);  //lambda exp
		Test test3=obj::add;  //method reference
		test2.display(20);
		test3.display(200);
		
		//constructor method reference
		System.out.println("================constructor method reference===================");
		Test t4=(i)->new MethodReferenceTest(i);  //lambda exp
		Test t5=MethodReferenceTest::new;  //method reference
		t4.display(30);
		t5.display(300);
	}
	
	
	public static void show(int n) {

		System.out.println("MethodReferenceTest.show() :"+n);
	}
	
	public void add(int n) {
		
		System.out.println("MethodReferenceTest.add() : "+n+n);
	}
}
