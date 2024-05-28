package java_9_features.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadingTest {

	public static void main(String[] args) throws InterruptedException {
		
		Employee emp1 = new Employee(101, "Amit1", 0, 5000, 30);
		Employee emp2 = new Employee(102, "Amit2", 0, 10000, 30);
		Employee emp3 = new Employee(103, "Amit3", 0, 3000, 30);
		Employee emp4 = new Employee(104, "Amit4", 0, 1000, 30);
		Employee emp5 = new Employee(105, "Amit5", 0, 2000, 30);
		Employee emp6 = new Employee(106, "Amit6", 0, 3000, 30);
		Employee emp7 = new Employee(107, "Amit7", 0, 5000, 30);
		Employee emp8 = new Employee(108, "Amit8", 0, 6000, 30);
		Employee emp9 = new Employee(109, "Amit9", 0, 3000, 30);
		Employee emp10 = new Employee(1010, "Amit10", 0, 4000, 30);
		Employee emp11 = new Employee(1011, "Amit11", 0, 5000, 30);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		empList.add(emp7);
		empList.add(emp8);
		empList.add(emp9);
		empList.add(emp10);
		empList.add(emp11);
		System.out.println(empList);
		
		ExecutorService ex = Executors.newFixedThreadPool(3);
		//ExecutorService ex = Executors.newCachedThreadPool();
		List<SalaryCalculation2> taskList=new ArrayList<SalaryCalculation2>();
		
		for(int i=0;i<empList.size();i++)
		{
			//SalaryCalculation sal=new SalaryCalculation(empList.get(i)); //Runnable
			SalaryCalculation2 sal=new SalaryCalculation2(empList.get(i)); //Callable
			taskList.add(sal);
		}
		
		ex.invokeAll(taskList);
		System.out.println(empList);
		
	}
}
