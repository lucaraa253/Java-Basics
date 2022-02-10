import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		int marks[] = {87,65,98,70,65};
		
		
//		Regular for loop to print array items
		System.out.println("Regular for loop");
		for(int i = 0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
//		Enhanced for loop to print array items
		System.out.println("Enhanced for loop");
		for(int i:marks) {
			System.out.println(i);
		}
		
//		Printing all items manually without for loop
		System.out.println("Without loop");
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
		
//		using for loops to gather information by the user
//		Created this num[] to help us parse through the array utilizing a for loop
		
//		The ask was to accept 5 numbers from the user and print the sum
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("Please enter 5 numbers");
		for(int i = 0; i< num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		System.out.println("The sum of all the numbers is : " + sum);
	}

}
