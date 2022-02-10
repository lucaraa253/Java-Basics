
public class Monitor {
	
	int num=100;
	
	public Monitor() {
		System.out.println("Monitor constructor called");
	}
	public void display() {
		System.out.println("display called and the value of num is : " + num);
	}

	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		monitor.display();

	}

}
