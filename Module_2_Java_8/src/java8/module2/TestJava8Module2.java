package java8.module2;

import java8.encrypt.EncryptTest;
import java8.module1.TestJava8Module1;

public class TestJava8Module2 {

	public static void main(String[] args) {
		
		System.out.println("TestJava8Module2.main()");
		TestJava8Module1 obj=new TestJava8Module1();
		obj.m1();
		
		EncryptTest encryptTest = new EncryptTest();
		encryptTest.encrypt();
	}
}
