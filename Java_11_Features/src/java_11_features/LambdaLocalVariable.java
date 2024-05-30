package java_11_features;

public class LambdaLocalVariable {

	public static void main(String[] args) {
		
		//Function<Integer, Integer> f1=(x)->10;
		Test t1=(x,y)->x+y;
		Test t2=(int x,int y)->x+y;
		Test t3=(var x,var y)->x+y; //if u r using var then all parameters must be declared as var.
		
		System.out.println(t1.add(10, 20));
		System.out.println(t2.add(100, 200));
		System.out.println(t3.add(1000, 2000));
	}
}
