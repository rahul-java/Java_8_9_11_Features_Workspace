package java_8_features.stream;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest2 {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("Rahul");
		stringList.add("Anil");
		stringList.add("Rohit");
		stringList.add("Ravi");
		stringList.add("Mohan");
		stringList.add("Nishant");
		stringList.add("Rakesh");
		stringList.add("Bharat");
		stringList.add("Amrit");
		stringList.add("Avanish");
		stringList.add("Aashish");
		stringList.add("Nisha");
		stringList.add("Ravi");
		stringList.add("Mohan");
		stringList.add("Nishant");
		stringList.add("Rakesh");
		stringList.add("Bharat");
		stringList.add("Rohit");
		stringList.add("Ravi");
		stringList.add("Mohan");
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Rahul", 45000));
		empList.add(new Employee(2, "Amit", 80000));
		empList.add(new Employee(3, "Akash", 55000));
		empList.add(new Employee(4, "Lalit", 65000));
		empList.add(new Employee(5, "Amrit", 75000));
		empList.add(new Employee(1, "Rahul", 95000));
		//empList.add(new Employee(3, "Akash", 55000));
		//empList.add(new Employee(4, "Lalit", 65000));
		//empList.add(new Employee(3, "Akash", 45000));
		//empList.add(new Employee(4, "Lalit", 65000));
		
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(105);
		numbers.add(110);
		numbers.add(115);
		numbers.add(120);
		numbers.add(125);
		numbers.add(25);
		numbers.add(250);
		
		//Counting the names which are repeated and using goupingBy
		Map<String, Long> stringCountMap = stringList.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(stringCountMap);
		
		//Count the employees which are having same empName
		Map<String, Long> empMap = empList.stream().collect(Collectors.groupingBy(e->e.getEmpName(),Collectors.counting()));
		System.out.println(empMap);
		
		//summarizingDouble the salary
		DoubleSummaryStatistics doubleSummaryStatistics = empList.stream().collect(Collectors.summarizingDouble(e->e.getEmpSalary()));
		System.out.println("DoubleSummaryStatistics ::: "+doubleSummaryStatistics);
		System.out.println("Count ::: "+doubleSummaryStatistics.getCount());
		System.out.println("Sum ::: "+doubleSummaryStatistics.getSum());
		System.out.println("Min ::: "+doubleSummaryStatistics.getMin());
		System.out.println("Max ::: "+doubleSummaryStatistics.getMax());
		System.out.println("Average ::: "+doubleSummaryStatistics.getAverage());
		
		double average = empList.stream().collect(Collectors.summarizingDouble(e->e.getEmpSalary())).getAverage();
		System.out.println("Average : "+average);
		
		// Limit and skip
		//limit(4) : it will continue till 4th element traversal
		numbers.stream().limit(4).forEach(n->System.out.println(n)); //this will print first 4 numbers
		System.out.println("--------------------------------------------");
		numbers.stream().limit(10).filter(n->n%2==0).forEach(n->System.out.println(n));
		
		//second largest number
		//largest number
		System.out.println("Largest No :");
		numbers.stream().sorted(Collections.reverseOrder()).limit(1).forEach(n->System.out.println(n));
		
		//skip(n) : it will skip first 3 elements from the list
		System.out.println("Skip(3)");
		numbers.stream().skip(3).forEach(n->System.out.println(n));
		
		//2nd largest number
		System.out.println("2nd largest number");
		numbers.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).forEach(n->System.out.println(n));
		
		//2nd smallest number
		System.out.println("2nd smallest number");
		numbers.stream().sorted().limit(2).skip(1).forEach(n->System.out.println(n));
		
		//find the employee details which is having 2nd highest salary
		System.out.println("find the employee details which is having 2nd highest salary");
		empList.stream().sorted((e1,e2)->e1.getEmpSalary()<e2.getEmpSalary()?1:(e1.getEmpSalary()==e2.getEmpSalary()?0:-1)).limit(2).skip(1).forEach(e->System.out.println(e));
		System.out.println("find the employee details which is having 3rd highest salary");
		empList.stream().sorted((e1,e2)->e1.getEmpSalary()<e2.getEmpSalary()?1:(e1.getEmpSalary()==e2.getEmpSalary()?0:-1)).limit(3).skip(2).forEach(e->System.out.println(e));
		
		//write a program to print first no in the given nos
		Optional<Integer> optional = numbers.stream().findFirst();
		Integer firstNo = numbers.stream().findFirst().get();
		System.out.println("finfFirst() : "+firstNo);
		
		Integer findAny = numbers.stream().findAny().get();
		System.out.println("findAny() :"+findAny);
		
		//flatMap
		//what is the difference between map and flatMap
		
		//map : follows 1 to 1 mapping
		System.out.println("map : follows 1 to 1 mapping");
		empList.stream().mapToDouble(e->e.getEmpSalary()).forEach(s->System.out.println(s));
		
		//flatMap : follows 1 to Many
		List<String> l1 = new ArrayList<String>();
		l1.add("Rahul");
		l1.add("Rohan");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("Amit");
		l2.add("Amrit");
		
		List<List<String>> l3 = new ArrayList<>();
		l3.add(l1);
		l3.add(l2);
		
		//Q. Input : List<List<String>> and Output : List<String>
		List<String> list = l3.stream().flatMap(l->l.stream()).collect(Collectors.toList());
		System.out.println("Concat list : "+list);
		
		System.out.println("========forEach()========forEachOrdered()===============");
		numbers.stream().forEach(n->System.out.println(n));
		System.out.println("=========No difference================");
		numbers.stream().forEachOrdered(n->System.out.println(n));
		
		LocalDateTime startTime=null;
		LocalDateTime endTime=null;
		Duration duration=null;
		
		System.out.println("Start of stream() Operation ============>>>>>>");
		startTime = LocalDateTime.now();
		empList.stream().map(e->e.getEmpName()).forEach(n->System.out.println(n));
		endTime=LocalDateTime.now();
		duration = Duration.between(startTime, endTime);
		System.out.println("Time taken for stream() operation :"+duration.toMillis());
		
		//stream() : insertion order is maintained
		//stream() : sequential processing
		
		System.out.println("Start of parallelStream() Operation============>>>>>>");
		startTime = LocalDateTime.now();
		empList.parallelStream().map(e->e.getEmpName()).forEach(n->System.out.println(n));
		//System.out.println("==========forEachOrdered()==================");
		//empList.parallelStream().map(e->e.getEmpName()).forEachOrdered(n->System.out.println(n));
		endTime=LocalDateTime.now();
		duration = Duration.between(startTime, endTime);
		System.out.println("Time taken for parallel stream() operation :"+duration.toMillis());
		
		//parallelStream() : insertion order is not maintained
		//parallelStream() : parallel processing
	}
}
