package java_11_features;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateInterfaceChanges {

	public static void main(String[] args) {
		
		String a[]= {""," ","\r","Hi","Test"};
		Arrays.stream(a).filter(p->!p.isBlank()).forEach(p->System.out.println(p));
		System.out.println("--------------------------------");
		Arrays.stream(a).filter(p->p.isBlank()).forEach(p->System.out.println(p));
		System.out.println("--------Predicate.not(Predicate)-------------------");
		Arrays.stream(a).filter(Predicate.not(p->p.isBlank())).forEach(p->System.out.println(p));
		System.out.println("-----------------------------------");
		
		//Predicate<Integer>
	}
}
