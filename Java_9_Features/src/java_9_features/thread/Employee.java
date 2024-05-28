package java_9_features.thread;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private double basicSalary;
	private int noOfWorkingDays;
	public Employee(int id, String name, double salary, double basicSalary, int noOfWorkingDays) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.basicSalary = basicSalary;
		this.noOfWorkingDays = noOfWorkingDays;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}
	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", basicSalary=" + basicSalary
				+ ", noOfWorkingDays=" + noOfWorkingDays + "]";
	}
	
}
