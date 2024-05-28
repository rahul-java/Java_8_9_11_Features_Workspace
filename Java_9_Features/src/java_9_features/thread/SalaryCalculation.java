package java_9_features.thread;

public class SalaryCalculation implements Runnable{

	private Employee employee=null;
	
	public SalaryCalculation(Employee employee)
	{
		this.employee=employee;
	}
	@Override
	public void run() {
        //calcylate salary
		double sal =employee.getBasicSalary()*employee.getNoOfWorkingDays();
		employee.setSalary(sal);
	}

}
