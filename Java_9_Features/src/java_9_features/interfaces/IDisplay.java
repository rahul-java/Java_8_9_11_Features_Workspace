package java_9_features.interfaces;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public interface IDisplay {

	//Java 9 features allows the developer to write private methods in interface
	
	private void duplicateCode() {
		//private methods in the interface will provide the code re-usability
		System.out.println("IDisplay.duplicateCode()");
		int c=10+20;
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Value of c is : "+c);
	}
	
	default void add1() {
		System.out.println("IDisplay.add1()");
		duplicateCode();
		
	}
	
	default void add2() {
		System.out.println("IDisplay.add2()");
		//duplicateCode();
		
		int c=10+20;
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Value of c is : "+c);
		
	}
	
	private static void reUseCode() throws Exception {
		BufferedReader bf=new BufferedReader(new FileReader("c:\\rahul\\abc.txt"));
		bf.lines();
	}
	
	static void showA() throws Exception {
		System.out.println("IDisplay.showA()");
		//BufferedReader bf=new BufferedReader(new FileReader("c:\\rahul\\abc.txt"));
		//bf.lines();
		reUseCode();
	}
	
	static void showB() throws Exception {
		System.out.println("IDisplay.showB()");
		//BufferedReader bf=new BufferedReader(new FileReader("c:\\rahul\\abc.txt"));
		//bf.lines();
		reUseCode();
	}
	
	
}
