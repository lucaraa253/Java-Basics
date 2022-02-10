import java.util.Date;
import java.util.Scanner;

public class Demo1 {

	public void printWelcomeMessage() {
		System.out.println("Hi, welcome to revature training");
	}
	
	public void addNumbers(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public int addNumbers1(int number1, int number2) {
		return number1 + number2;
	}
	
	
//	Enhanced for loops
	public int addNumbers2(int...num) {
		int sum = 0;
		for(int i:num) {
			System.out.println(i);
			sum = sum + i;
		}
		return sum;
	}
	
	public void printProductNames(String...productName) {
		for(String p:productName) {
			System.out.println(p);
		}
	}
	
	
	public static void main(String[] args) {
//		Welcome message
		System.out.println("Hello and welcome to day 2 training");
		Demo1 d = new Demo1();
		d.printWelcomeMessage();
//		Add numbers 1
		d.addNumbers(16, 21);
		int result = d.addNumbers1(7, 7);
		result += d.addNumbers1(3, 9);
		result += d.addNumbers1(44, 99);
		System.out.println(result);
//		add numbers2 for enhanced for loop - takes any number of parameters
		int result2 = d.addNumbers2(4,4);
		result2 += d.addNumbers2(3, 9);
		result2 += d.addNumbers2(3, 7);
		System.out.println(result2);
//		Enhanced for loop for Strings
		d.printProductNames("Watch", "Hairbrush", "Computer");
		
		
//		Utilizing System.in and java.util classes
//		Scanner declares the system.in function which allows you to access the keyboard for inputs in the command prompt/terminal
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age : ");
		int age = sc.nextInt();
		System.out.println("You are " + age + " years old");
		
		System.out.println("What is your favorite color : ");
		String color = sc.next();
		System.out.println("Your favorite color is " + color);
		
		Date date = new Date();
		System.out.println(date);
		
	}

}













