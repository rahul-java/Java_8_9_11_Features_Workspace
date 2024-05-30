import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;

import java_8_features.stream.Employee;

public class ReduceMethodTest2 {

	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Rahul", 45000));
		empList.add(new Employee(2, "Amit", 80000));
		empList.add(new Employee(3, "Akash", 55000));
		empList.add(new Employee(4, "Lalit", 65000));
		empList.add(new Employee(5, "Amrit", 75000));
		empList.add(new Employee(6, "Rahul", 95000));
		
		empList.stream().map(p->p.getEmpSalary()).reduce((m,n)->m+n).ifPresent(p->System.out.println("Sum of Salary is :"+p));
		empList.stream().map(p->p.getEmpSalary()).reduce((m,n)->m>n?m:n).ifPresent(p->System.out.println("Maximun Salary is :"+p));
		empList.stream().map(p->p.getEmpSalary()).reduce((m,n)->m<n?m:n).ifPresent(p->System.out.println("Minimum Salary is :"+p));
	}
}
