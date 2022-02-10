package Overloading;

public class Demo {
	
	public void add(int num1, int num2) {
		System.out.println("Adding two numbers : " + (num1 + num2));
	}
	
	public void add(String num1, int num2) {
		System.out.println("Adding one string and one number : " + (num1 + num2));
	}
	
	public void add(int num2, String num1) {
		System.out.println("Adding one number and one string : " + (num1 + num2));
	}
	
	public void add(String firstName, String lastName) {
		System.out.println("Adding a first and last name : " + (firstName + " " + lastName));
	}
	
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.add(5, 6);
		d.add("Jimmy", 69);
		d.add("Nick", 423);
		d.add("Nicholas", "Lucara");
	}
}
