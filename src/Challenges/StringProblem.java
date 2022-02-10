package Challenges;

public class StringProblem {
	
	
	
	public static void main(String[] args) {
		
//		Print the character at the 12th index
		String s = "The quick brown fox jumps over the lazy dog";
		System.out.println(s.charAt(12));
		
//		Check whether the string contains the word "is"
		System.out.println(s.contains("is"));
		
//		Add to the string "and killed it"
		s = s.concat(" and killed it");
		System.out.println(s);
		
//		Check whether the string ends with the word Dog
		if(s.endsWith("dogs")) {
			System.out.println("The string ends with dogs");
		}else {
			System.out.println("The string does not end with dogs");
		}
		
//		Check whether the string is equal to "The quick brown fox jumps over the lazy dog"
		String s2 = "The quick brown fox jumps over the lazy dog";
		if(s == s2) {
			System.out.println("The Strings match");
		}else {
			System.out.println("The strings do not match");
		}
//		Check whether the string is equal to "THE QUICK BROWN FOX JUMPED OVER THE LAZY DOG"
		String s3 = "THE QUICK BROWN FOX JUMPED OVER THE LAZY DOG";
		if(s2 == s3) {
			System.out.println("The Strings match");
		}else {
			System.out.println("The strings do not match");
		}
		
//		Find the length of the string
		
		System.out.println(s.length());
		
//		Check whether the string matches to "The quick brown fox jumps over the lazy dog"
		String s4 = "The quick brown fox jumps over the lazy dog";
		if(s == s4) {
			System.out.println("The Strings match");
		}else {
			System.out.println("The strings do not match");
		}
		
//		Replace the word "The with the word "A"
		
		System.out.println(s.replace("The", "A"));
		
//		Split the string into two sentences

		
		System.out.println(s.substring(0, 30));
		System.out.println(s.substring(31));
		
//		Print the animals names separately
//		Fox
		int index1 = s.indexOf("f");
		int index2 = s.indexOf("f") + 3;
		System.out.println(s.substring(index1, index2));
//		Dog
		System.out.println(s.substring(40, 43));
		
//		Print the above string in lower case
		System.out.println(s.toLowerCase());
		
//		Print the above string in upper case
		System.out.println(s.toUpperCase());
		
//		Find character position of "a"
		System.out.println(s.indexOf("a"));
		
//		Find the character position of e
		System.out.println(s.indexOf("e"));
		
		
		
		
		
	}
}
