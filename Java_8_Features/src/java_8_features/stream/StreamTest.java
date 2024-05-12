package java_8_features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java_8_features.collection_inhancement.Employee;

public class StreamTest {

	public static void main(String[] args) {
		
		//Stream-> Stream is used to perform the operations on the collection object.
		//Stream is a interface which has multiple methods.
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		//how to  create the object of Stream
		Stream<String> streamObj = Stream.of("A","E","I","O","U");
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Rahul", 45000));
		empList.add(new Employee(2, "Amit", 80000));
		empList.add(new Employee(3, "Akash", 45000));
		empList.add(new Employee(4, "Lalit", 65000));
		empList.add(new Employee(5, "Amrit", 75000));
		
		//print the emp whose name start with A without using java 8
		for(int i=0;i<empList.size();i++)
		{
			if(validateEmpName(empList.get(i).getEmpName()))
				System.out.println(empList.get(i));
		}
		System.out.println("-------------------------------------------------------------");
		
		//print the emp whose name start with A using java 8
		System.out.println("Code with Stream");
		//filter(Predicate->takes argument and returns boolean)
		System.out.println("========filter(Predicate->takes argument and returns boolean)==============");
		empList.stream().filter((e)->e.getEmpName().startsWith("A")).forEach((e)->System.out.println(e));
		
		System.out.println("OutPut : "+empList.stream().filter((e)->e.getEmpName().startsWith("A")));
		//Intermediate operation and terminal operation
		//filter,map : Intermediate operation
		//forEach,collect : terminal operation
		
		//write a program to collect employee names into separate List from empList
		//map(Function->takes argument and return value)
		System.out.println("=============map(Function->takes argument and return value)===============");
		List<String> empNameList = empList.stream().map((e)->e.getEmpName()).collect(Collectors.toList());
		empNameList.forEach((e)->System.out.println(e));
		
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(105);
		numbers.add(110);
		numbers.add(115);
		numbers.add(120);
		numbers.add(125);
		
		//write a lambda expression to print the even numbers
		System.out.println("----------write a lambda expression to print the even numbers-------");
		numbers.stream().filter((n)->n%2==0).forEach((n)->System.out.println("Evenn Nos:"+n));
		//to store in a collection object
		Set<Integer> evenNoSet = numbers.stream().filter((n)->n%2==0).collect(Collectors.toSet());
		List<Integer> evenNoList = numbers.stream().filter((n)->n%2==0).collect(Collectors.toList());
		System.out.println(evenNoSet+" , "+ evenNoList);
		
		//write a program to collect all the employee ids into separate list of employee ids
		List<Integer> empIdList = empList.stream().map((e)->e.getEmpId()).collect(Collectors.toList());
		System.out.println("--------write a program to collect all the employee ids into separate list of emp ids---------");
		System.out.println(empIdList);
	}

	private static boolean validateEmpName(String empName) {
		if(empName.startsWith("A"))
			return true;
		else
     		return false;
	}
}
