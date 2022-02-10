import java.util.Scanner;

public class ALGOS {
	
	
	public static void main(String[] args) {
//		Fizzbuzz
//		for(int i = 1;i <=155;i++) {
//			if(i%5==0 && i%3==0) {
//				System.out.println("FizzBuzz");
//			}
//			else if(i%3==0) {
//				System.out.println("Fizz");
//			}
//			else if(i%5==0) {
//				System.out.println("Buzz");
//			}else {
//				System.out.println(i);
//			}
//			
//		}
		
//		Whether or not it is a leap year
		Scanner sc = new Scanner(System.in);
		int leapYear = 2024;
		
		int year = sc.nextInt();
		System.out.println("Type your guess for the next Leap Year :");
		if(year == leapYear) {
			System.out.println("The year " + year + " is a leap year");
		}else {
			System.out.println("The year " + year + " is not a leap year");
		}
		

	}
}







