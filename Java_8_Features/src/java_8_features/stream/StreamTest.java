package java_8_features.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
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
		numbers.add(25);
		
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
		
		//write a program to print min number from the given list
		/*int minVal=numbers.get(0);
		for(int i=1;i<numbers.size();i++)
		{
			if(numbers.get(i)<minVal)
				minVal=numbers.get(i);
		}
		System.out.println("Min Value :"+minVal);*/
		
		Integer minVal = numbers.stream().min((i,j)->(i<j)?-1:(i==j)?0:1).get();
		System.out.println("Min Value : "+minVal);
		
		//write a program to print max number from the given list
		/*int maxVal=numbers.get(0);
		for(int i=1;i<numbers.size();i++)
		{
			if(numbers.get(i)>maxVal)
				maxVal=numbers.get(i);
		}
		System.out.println("Max Value :"+maxVal);*/
		
		Integer maxVal = numbers.stream().max((i,j)->(i<j)?-1:(i==j)?0:1).get();
		System.out.println("Max Value : "+maxVal);
		
		//write a program to sort the list of nos
		System.out.println("-------sort the list of nos------------");
		numbers.stream().sorted().forEach(n->System.out.println(n));
		List<Integer> collect = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted nos : "+collect);
		
		//w.a.p to sort the list of integer in descending order
		List<Integer> descList = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());	
		System.out.println("Desc Order : "+descList);
		
		System.out.println("Sorting using Comparator in Ascending order :"+numbers.stream().sorted((n1,n2)->(n1<n2)?-1:(n1==n2)?0:1).collect(Collectors.toList()));
		System.out.println("Sorting using Comparator in Descending order :"+numbers.stream().sorted((n1,n2)->(n1<n2)?1:(n1==n2)?0:-1).collect(Collectors.toList()));
		
		
		//w.a.p to print employee name who is getting maximum salary
		Employee employee = empList.stream().max((e1,e2)->e1.getEmpSalary()<e2.getEmpSalary()?-1:e1.getEmpSalary()==e2.getEmpSalary()?0:1).get();
		System.out.println("Max Salary Employee :"+employee);
		
		//w.a.p to print employee name who is getting minimum salary
		Employee employee1 = empList.stream().min((e1,e2)->e1.getEmpSalary()<e2.getEmpSalary()?-1:e1.getEmpSalary()==e2.getEmpSalary()?0:1).get();
		System.out.println("Min Salary Employee :"+employee1);
		
	}

	private static boolean validateEmpName(String empName) {
		if(empName.startsWith("A"))
			return true;
		else
     		return false;
	}
}
