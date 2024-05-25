package java_9_features.diamond_operator;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperatorTest {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(10);
		l.add("Rahul");
		l.add(new Employee());
		l.add(10.25);
		
		System.out.println(l);
		
		String s = (String)l.get(1); //TypeCasting
		
		//till 1.5v
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(100);
		
		//java 1.7v
		List<Integer> l2=new ArrayList<>();
		l2.add(10);
		l2.add(100);
		
		//java 1.9v
		//anonympous inner class 
	}
}
