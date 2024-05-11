package java_8_features.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestImpl4 implements Test {

	@Override
	public void display() {
		System.out.println("TestImpl4.display()");

	}
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		//Collection - interface
		//Collections - class
		Collections.synchronizedList(list);
	}

}
