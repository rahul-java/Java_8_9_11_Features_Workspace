package java_11_features;

import java.util.Arrays;

public class OuterClass {

	class InnerClass1 {

	}

	class InnerClass2 {

	}
	
	class InnerClass3 {

	}

	public static void main(String[] args) {
		
		//Class<?>[] nestMembers = OuterClass.class.getNestMembers();
	System.out.println(Arrays.toString(OuterClass.class.getNestMembers()));	
	// O/P
	//[class java_11_features.OuterClass, class java_11_features.OuterClass$InnerClass1, class java_11_features.OuterClass$InnerClass2, class java_11_features.OuterClass$InnerClass3]

	System.out.println(OuterClass.class.isNestmateOf(InnerClass3.class)); //true
	System.out.println(InnerClass3.class.isNestmateOf(OuterClass.class)); //true
	System.out.println(OuterClass.class.isNestmateOf(OuterClass.class)); //true
	System.out.println(InnerClass3.class.isNestmateOf(InnerClass3.class)); //true
	
	System.out.println(OuterClass.class.isNestmateOf(PredicateInterfaceChanges.class)); //false
	
	System.out.println(OuterClass.class.getNestHost()); //class java_11_features.OuterClass
	System.out.println(InnerClass3.class.getNestHost()); //class java_11_features.OuterClass

	}
}
