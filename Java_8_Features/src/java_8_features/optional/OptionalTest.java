package java_8_features.optional;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {

		Optional<String> optional = display(null);
		
		if(optional.isPresent())
		{
			String str = optional.get();
			
			if (str.contains("i")) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
		else {
			System.out.println("null value passed : "+optional);
		}

	}

	public static Optional<String> display(String s) {
		
		//what is the difference between of() and ofNullable()
		
		//of()=>if u pass null value then it will not handle the null check and throw exception
		//ofNullable()=> this will handle the null check and return Optional object
		
		//Optional<String> optional = Optional.of(s);
		Optional<String> optional = Optional.ofNullable(s);
		
		return optional;
	}
}
