package java_8_features.stream;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private double empSalary;
	
	
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	public static int compare(Employee e1,Employee e2) {
		// TODO Auto-generated method stub
		return (e1.getEmpId()<e2.getEmpId())?-1:(e1.getEmpId()==e2.getEmpId())?0:1;
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return compare(this, e);
	}
	
	
	
}
