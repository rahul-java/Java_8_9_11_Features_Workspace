package java_9_features.try_with_resource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class TryWithResourceJava7 {

	public static void main(String[] args) throws IOException {

		/* BufferedReader b=null; 
		 try { 
		  b= new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\SRINU EAMCET\\Allotment Order.pdf"));
		 }catch (Exception e)
		 { 
		  // TODO: handle exception 
		  }finally 
		 {
			  if(b!=null) {
		 b.close();
		 }
			  }
		*/

		// BufferedReader b=null;
		try (AutoCLosableExample autoClosable = new AutoCLosableExample();
				BufferedReader b = new BufferedReader(new FileReader(
						"C:\\Users\\hp\\Downloads\\02JavaFeatures\\Java9Features\\src\\com\\ashokit\\java9changes\\TryWithResourceJava7.java"))) {
			// b= new BufferedReader(new
			// FileReader("C:\\Users\\hp\\Downloads\\02JavaFeatures\\Java9Features\\src\\com\\ashokit\\java9changes\\TryWithResourceJava7.java"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hello");
		}

		AutoCLosableExample a = new AutoCLosableExample();
		BufferedReader b = new BufferedReader(new FileReader(
				"C:\\Users\\hp\\Downloads\\02JavaFeatures\\Java9Features\\src\\com\\ashokit\\java9changes\\TryWithResourceJava7.java"));
		try (a; b) {
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("hi");
		}

	}
}
