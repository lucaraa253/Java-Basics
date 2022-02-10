package inheretance;

public class Employee {
	int employeeId;
	String employeeName;
	int salary = 9000;
	
	public Employee() {
		System.out.println("Default constr initialized");
	}
	
	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		System.out.println("Employee constr called");
	}
	

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	
}
