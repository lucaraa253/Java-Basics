package inheretance;

public class Manager extends Employee{
	String departmentName;
	int salary = 18000;
	
	public Manager() {
		super();
		System.out.println("Manager initialized");
	}
	
	public Manager(String departmentName) {
		super();
		System.out.println("Manager initialized");
		this.departmentName = departmentName;
	}

	public Manager(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		System.out.println("Manager paramatarized called");
		// TODO Auto-generated constructor stub
	}
	
	public void displayManagerDetails() {
		int salary=25000;
		
		System.out.println("Manager ID : " + employeeId);
		System.out.println("Department Name : " + departmentName);
		System.out.println("Local Salary : " + salary);
		System.out.println("Manager Salary : " + this.salary);
		System.out.println("Employee Salary : " + super.salary);
	}
	
	
}
