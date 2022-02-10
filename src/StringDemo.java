
public class StringDemo {

	public static void main(String[] args) {
		
		String name = "NickLucara";
//		Prints Name
		System.out.println(name);
//		Prints out length of letters
		System.out.println(name.length());
//		Prints out character at certain point
		System.out.println(name.charAt(2));
//		Concatenating strings
		System.out.println(name.concat("Revature"));
//		Compares strings
		System.out.println(name.compareTo("Amad"));
		System.out.println(name.compareToIgnoreCase("Nicky"));
//		Substrings to remove letters from the front
		System.out.println(name.substring(2));
//		Makes String uppercase
		System.out.println(name.toUpperCase());
//		Checks if a string ends with something
		System.out.println(name.endsWith("n"));
//		Checks if a name starts with something
		System.out.println(name.startsWith("N"));
		
//		Checking for memory locations
//		Garbage collection will come through and make sure that the memory location is pointint to the last instantiated point of value
		String name1 = "Richard";
		name1="Alex";
		name1="John";
		String name2 = "Richard";
		
		System.out.println(name1.equals(name2));
		System.out.println(name2);

	}

}
