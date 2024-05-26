package java_9_features.optional_enhancement;

import java.util.Optional;

public class OptionalEnhancementTest {

	public static void main(String[] args) {
		
		System.out.println("Optional : ifPresent(Consumer)");
		
		Optional<Integer> opt = m1();
		//generally min() max() map flatMap returns optional object
		//ifPresent(Consumer)
		opt.ifPresent(p->System.out.println(p));
		//ifPresentOrElse(Consumer,Runnable)
		opt.ifPresentOrElse(p->System.out.println(p),()->System.out.println("NULL VALUE"));
		
		Integer orElse = opt.orElse(0);
		System.out.println(orElse);
		System.out.println(opt.orElseGet(()->10));
		System.out.println(opt);
	}
	
	public static Optional<Integer> m1(){
		//Optional<Integer> optional = Optional.ofNullable(123);
		Optional<Integer> optional = Optional.ofNullable(null);
		return optional;
	}
}
