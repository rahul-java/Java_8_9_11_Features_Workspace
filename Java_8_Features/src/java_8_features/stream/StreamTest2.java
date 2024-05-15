package java_8_features.stream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
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
		empList.add(new Employee(3, "Akash", 45000));
		empList.add(new Employee(4, "Lalit", 65000));
		empList.add(new Employee(5, "Amrit", 75000));
		empList.add(new Employee(1, "Rahul", 95000));
		empList.add(new Employee(3, "Akash", 45000));
		empList.add(new Employee(4, "Lalit", 65000));
		empList.add(new Employee(3, "Akash", 45000));
		empList.add(new Employee(4, "Lalit", 65000));
		
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
	}
}
