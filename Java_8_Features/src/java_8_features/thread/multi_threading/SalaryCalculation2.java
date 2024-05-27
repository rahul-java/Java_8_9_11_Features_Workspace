package java_8_features.thread.multi_threading;

import java.util.concurrent.Callable;

public class SalaryCalculation2 implements Callable<Employee>{

	private Employee employee=null;
	
	public SalaryCalculation2(Employee employee)
	{
		this.employee=employee;
	}

	@Override
	public Employee call() throws Exception {
		 //calcylate salary
		double sal =employee.getBasicSalary()*employee.getNoOfWorkingDays();
		employee.setSalary(sal);
		return employee;
	}

}
