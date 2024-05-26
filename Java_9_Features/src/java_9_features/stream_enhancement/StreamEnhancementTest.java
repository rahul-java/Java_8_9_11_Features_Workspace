package java_9_features.stream_enhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEnhancementTest {

	public static void main(String[] args) {
		
		//short-Circuit methods
		//skip
		//limit
		
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		l.add(35);
		l.add(40);
		
		//till java 8 we can only add long value in limit() and skip()
		System.out.println("=====limit(3)=====");
		l.stream().limit(3).forEach(n->System.out.println(n));
		System.out.println("=====skip(3)=====");
		l.stream().skip(3).forEach(n->System.out.println(n));
		
		//in java 9
		//takeWhile(Predicate) => limit()
		//dropWhile(Predicate) => skip()		
		
		System.out.println("\n=====takeWhile(Predicate)=====");
		l.stream().takeWhile(n->n<35).forEach(n->System.out.print(n+" "));
		
		System.out.println("\n=====dropWhile(Predicate)=====");
		l.stream().dropWhile(n->n<35).forEach(n->System.out.print(n+" "));
		
		System.out.println("\n=====takeWhile(Predicate)=====");
		l.stream().takeWhile(n->n%2==0).forEach(n->System.out.print(n+" "));
		
		System.out.println("\n=====dropWhile(Predicate)=====");
		l.stream().dropWhile(n->n%2==0).forEach(n->System.out.print(n+" "));
		
		System.out.println("\n=====filter stmt=====");
		l.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
		System.out.println();
		
		System.out.println("====================for loop===============================");
		
		for(int i=0;i<l.size();i++)
			System.out.println(l.get(i));
		
		System.out.println("======================Stream : iterate(initialize,condition,increment/decrement)============================");
		
		Stream.iterate(0, i->i<l.size(), i->i+1).forEach(i->System.out.println(l.get(i)));
	}
}
