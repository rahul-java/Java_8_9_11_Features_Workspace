package java_8_features.functional_programming;

public class AnonymousClassImplTest {

	//main advantage of Lambda Expression is Functional Programming.
	//one of main advantage of lambda expression is replacing Anonymous class using lambda expression.
	
	public static void main(String[] args) {
		
		Thread t=new Thread(new Runnable() {
			//Anonymous Inner class
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("FunctionalProgrammingTest3.main(...).new Runnable() {...}.run()");
			}
		}); 
		
		Thread t1=new Thread(()->System.out.println("Calling run method"));
	}
}
