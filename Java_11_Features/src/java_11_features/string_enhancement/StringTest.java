package java_11_features.string_enhancement;

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
		
	}
}
