package inheretance;

public class WrapperClass {
	
	public static void main(String[] args) {

		
		
//		We have to add the numbers that come from the command line
//		Primitive data type and an object
		int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println(sum);
		
		long salary1 = 91716;
		Long salary2 = 91716l;
		
//		Converting primitive to object
//		Boxing
		int marks = 100;
		Integer newMarks = new Integer(marks);
//		Autoboxing
		Integer newMarks2 = marks;
//		Unboxing
		Double budget = 19272.87;
		double budget1 = Double.valueOf(budget);
//		auto unboxing
		double budget2 = budget;
	}
	
}
