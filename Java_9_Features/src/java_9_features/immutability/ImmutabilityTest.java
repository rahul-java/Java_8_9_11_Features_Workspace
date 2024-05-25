package java_9_features.immutability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutabilityTest {

	public static void main(String[] args) {
		
		//Immutability in java 8 
		
		String s="Rahul"; //immutable
		s="Rama"; //immutable
		
		//make this list as immutable
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		List<Integer> unmodifiableList1 = Collections.unmodifiableList(list);
		list.add(60); //by adding in this obj automatically 60 will be added to the unmodifiableList1 
		//unmodifiableList1.add(60); //Exception : java.lang.UnsupportedOperationException
		System.out.println(list); //[10, 20, 30, 40, 50, 60]
		System.out.println(unmodifiableList1); //[10, 20, 30, 40, 50, 60]
		
		//to over come this problem do not create new obj just replace old one
		list = Collections.unmodifiableList(list); //now you can not add or remove anything
		
		List<String> monthList=new ArrayList<String>();
		monthList.add("January");
		monthList.add("February");
		monthList.add("March");
		monthList.add("April");
		monthList.add("May");
		monthList.add("June");
		monthList.add("July");
		monthList.add("August");
		monthList.add("September");
		monthList.add("October");
		monthList.add("November");
		monthList.add("December");
		// all months are added , now no need to allow to add any month in this list
		// and also do not allow anybody to remove any month
		List<String> unmodifiableList2 = Collections.unmodifiableList(monthList);
		System.out.println(monthList); //[January, February, March, April, May, June, July, August, September, October, November, December]
		monthList.remove(11); // this will utomatically reflect on unmodifiableList2
		//unmodifiableList2.remove(0);  //java.lang.UnsupportedOperationException
		System.out.println(unmodifiableList2); //[January, February, March, April, May, June, July, August, September, October, November]
		
		//to over come this problem do not create new obj just replace old one
		monthList = Collections.unmodifiableList(monthList); //now you can not add or remove anything
		//monthList.add("December");
		
		//=============================================================================================================================
		//Immutability in java 9
		//by calling of() method
		
		List<Integer> numberList=List.of(10,20,30,40,50);
		System.out.println(numberList);
		//numberList.add(60); //Exception in thread "main" java.lang.UnsupportedOperationException
		
		List<String> weekDays=List.of("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
		System.out.println(weekDays);
		//weekDays.remove(0); //Exception in thread "main" java.lang.UnsupportedOperationException
		
	}
}
