package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparatorTest2 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(50);
		list.add(20);
		list.add(70);
		list.add(250);
		list.add(500);
		list.add(150);
		
		//maintain insertion order
		System.out.println("Order :(insertion order) :: "+list); //insertion order
		
		//w.a.p to arrayList in sorted order
		
		Collections.sort(list); //beDefault it is using Comparable(I): compareTo()
		System.out.println("Sorted Order :"+list);  //ascending order
		
		/*Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1<o2)?1:(o1==o2)?0:-1;
			}
		});*/
		
		//converted into lambda expression
		Collections.sort(list, (o1, o2)->{
				return (o1<o2)?1:(o1==o2)?0:-1;
		});
		System.out.println("After Sorting Desc Order :"+list);  //descending order
				
	}

	
}
