package inheretance;

public class App {
	public static void main(String[] args) {
		Manager m = new Manager(109, "David");
		m.departmentName = "HR";
		m.displayManagerDetails();
		
		int count = 0;
		while (count <  2) {
		    System.out.print("Hi ");
		}
		
	}
}
