package java_8_features.functional_interface;

@FunctionalInterface
public interface Test1 {

	//user defined abstract method
	public void display();
	
	//overridden in Object class
	public int hashCode();
	public boolean equals(Object obj);
	public String toString();
	
	//this Test1 interface is still a @FunctionalInterface having more than 1 abstract methods
	
	//this also a @FunctionalInterface 
	//these 3 methods will not be counted as abstract method because they are overridden in Object class
	
	//Comparator is also an example of @FunctionalInterface which has more than 1 abstract methods
}
