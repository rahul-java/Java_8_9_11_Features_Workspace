package java_11_features.string_enhancement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringTest {

	public static void main(String[] args) {
		
		String s="Rahul"; //String Literal : SCP String Constant Pool[Heap{SCP}] //[SCP] memory reference will take from SCP
		String s1=new String("RahulPandey"); //new Keyword : Heap(new object) and SCP
		//s,s1 both are string object
		String s2=new String("RahulPandey");
		String s3="Rahul";
		String s4=new String("ABC");
		String s5=new String("abc");
		String s6=new String("Rahul"); //[Heap + SCP] but memory reference will take from Heap
		
		System.out.println(s==s3);//true == checks the memory reference/memory location of the object
		System.out.println(s1==s2);//false
		
		//Imp Statement
				//if the HashCode is same then object may or may not be same
				//if the memory location is same then HashCode must be same
		
		System.out.println("s1 HashCode : "+s1.hashCode()); //-704981301 (HashCode is generated based on content [s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]]); where s1 s2 s3 are character's ASCI value and n is the length of character array;
		System.out.println("s2 HashCode : "+s2.hashCode()); //-704981301
		System.out.println("s4 HashCode : "+s4.hashCode()); //64578 [65*31^2+66*31^1+67*31^0]
		System.out.println("s5 HashCode : "+s5.hashCode()); //96354
		
		System.out.println("s6 HashCode : "+s6.hashCode()); //78722128
		System.out.println("s HashCode : "+s.hashCode()); //78722128
		System.out.println(s==s6.intern()); //true //intern() return the SCP reference
		System.out.println(s==s6); //false
		
		String s7="ABCD"; //SCP
		String s8=new String("ABCD"); //HEAP+SCP but memory reference of HEAP
		String s9=new String("ABCD").intern(); //HEAP+SCP but memory reference of SCP
		System.out.println(s7==s8); //false
		System.out.println(s7==s9); //true
		
		//s="Rahul"
		s.concat(" Hi"); // it will be saved in new location
		System.out.println(s); //Rahul
		s=s.concat(" Hi");
		s.substring(0,2);
		System.out.println(s);//Rahul Hi
		s=s.substring(0, 2);
		System.out.println(s);//Ra
		System.out.println(s.concat(" Hello"));//Ra Hello
		s.repeat(2); //Java 11
		System.out.println(s);//Ra
		s=s.repeat(2); //Java 11
		System.out.println(s); //RaRa
		System.out.println(s.repeat(2)); //RaRaRaRa
		//System.out.println(s.repeat(-2)); //Exception in thread "main" java.lang.IllegalArgumentException: count is negative: -2
		//System.out.println(s.repeat(Integer.MAX_VALUE)); //Exception in thread "main" java.lang.OutOfMemoryError: Required length exceeds implementation limit
		
		System.gc(); // this will put a request to the Garbage Collection
	    //Runtime.getRuntime().gc(); // same as above
		
		String str=" Rahul Pandey ";
		System.out.println(str);
		System.out.println(str.trim()); // it will remove spaces before and after of the string
		
		//Java 11
		System.out.println(str.stripLeading()); //it will remove starting spaces only 
		System.out.println(str.stripTrailing()); //it will remove ending spaces only 
		System.out.println(str.strip());
		
		String str2='\u2001'+"String  with Spaces in latest version"+'\u2001';
		System.out.println(str2);
		System.out.println(str2.strip()); // it will remove both spaces unicode
		System.out.println(str2.trim()); //it will not remove spaces unicode bcoz not able to identified spaces ('U+0020' (the space character).)
		
		String str3='\u0020'+"String  with Spaces in older version"+'\u0020';
		System.out.println(str3.strip()); // it will remove both spaces
		System.out.println(str3.trim()); // it will remove both spaces bcoz it is able to identified space unicode '\u0020'
		
		String j="";
		System.out.println(j.isBlank()); //true
		System.out.println(j.isEmpty()); //true
		j=" ";
		System.out.println(j.isBlank()); //true
		System.out.println(j.isEmpty()); //false
		j="ABC";
		System.out.println(j.isBlank()); //false
		System.out.println(j.isEmpty()); //false
		
		System.out.println("Lines method output : ");
		String msg="Karthik is teaching \n Java \n new Features.";
		System.out.println(msg);
		// \n or \r or \n\r :: are called line terminators \n and \r both are same
		System.out.println(Arrays.toString(msg.split("\n"))); //[Karthik is teaching ,  Java ,  new Features.]
		
		//lines() method
		System.out.println("============lines() method============");
		msg.lines().forEach(p->System.out.println(p));
		System.out.println("-----------------------");
		msg.lines().filter(p->p.equalsIgnoreCase(" JAVA ")).forEach(p->System.out.println(p));
		System.out.println("----------------");
		Arrays.stream(msg.split("\n")).forEach(p->System.out.println(p)); //split() method has its own limitation
		
		//JAVA 10 Feature
		//local variable type inference
		//it is allowed inside method only or only local variable scope
		var v1="Rahul";
		var v2=101;
		var v3=new ArrayList<Integer>();
		var v4=105.50;
		var v5=1010;
		//var v6; //error occur , initialization must required
		System.out.println("Local variable type inference : "+v2+v4); //it will concat
		System.out.println("Local variable type inference : "+v2+v5); //it will concat
		
		Map<String,Integer> map = m1();
		map.put("num1", 1010);
		var map2=m1();
		map2.put("num1", 2020);
		
	}
	
	//var v1=10; // it is not allowed here or global variable or class member
	
	public static Map<String, Integer> m1(){
		return new HashMap<String, Integer>();
	}
}
