import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;

public class ReduceMethodTest {

	public static void main(String[] args) {
		
		int a[]= {2,5,4,7,3,1,6,8,10,9};
		
		System.out.println("----------reduce-----------");
		OptionalInt reduce = Arrays.stream(a).reduce((x,y)->x+y);
		System.out.println(reduce.getAsInt());
		
		System.out.println("--------ifPresent------------");
		Arrays.stream(a).reduce((x,y)->x+y).ifPresent(p->System.out.println(p));
		
		System.out.println("-------------IntBinaryOperator is a Functional Interface-------------------");
		IntBinaryOperator ibo=(x,y)->x+y;
		int res = ibo.applyAsInt(10, 20);
		System.out.println(res);
		
		System.out.println("-------------min------------------");
		Arrays.stream(a).reduce((x,y)->x<y?x:y).ifPresent(p->System.out.println(p));
		
		System.out.println("-------------max------------------");
		Arrays.stream(a).reduce((x,y)->x>y?x:y).ifPresent(p->System.out.println(p));
		
		String s[]= {"India","Nepal","Bhutan","Bangladesh"};
		System.out.println("--------concat---------");
		Arrays.stream(s).reduce((x,y)->x+" "+y).ifPresent(p->System.out.println(p));
	}
}
