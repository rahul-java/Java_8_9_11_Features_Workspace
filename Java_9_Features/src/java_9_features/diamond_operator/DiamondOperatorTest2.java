package java_9_features.diamond_operator;

public class DiamondOperatorTest2 {

	public static void main(String[] args) {
		
		//java 1.9v
		//anonymous inner class 
		//we can not create object of abstract class so we inherit that abstract class using inner class
		//in java 9 no need to assign generic on both side(this is the change in java 9 in diamond operator)
		//in java 8 we need to assign generic on both side
		
		DiamondAbstract<Integer> d=new DiamondAbstract<>() {
			
			@Override
			public void add(Integer n1, Integer n2) {
				int res=n1+n2;
				System.out.println(res);
			}
		};		
	}
}
