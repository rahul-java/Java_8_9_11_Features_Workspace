

public class DiamondOperatorTest2 {

	public static void main(String[] args) {
		
		//java 1.9v
		//anonympous inner class 
		//we can not create obj of abstract class so we inherit that abstract class using inner class
		
		//DiamondAbstract<Integer> d=new DiamondAbstract<>() { //Error occurred
		DiamondAbstract<Integer> d=new DiamondAbstract<Integer>() {
			
			@Override
			public void add(Integer n1, Integer n2) {
				// TODO Auto-generated method stub
				
			}
		};		
	}
}
