package inheretance;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		int count = 0;
		String quotes = "Honesty is the best policy and we will not stand for anything less";
		
		System.out.println("Normal way");
		StringTokenizer tokenizer = new StringTokenizer(quotes);
		System.out.println("Number of words : " + tokenizer.countTokens());
		
		System.out.println("Next way");
		System.out.println("-------------------------");
		
		String quotes2 = "Honesty:is:the:best:policy";
		StringTokenizer tokenizer2 = new StringTokenizer(quotes, :);
//		StringTokenizer tokenizer2 = new StringTokenizer(quotes, "y");
//		System.out.println("This one" + tokenizer2.countTokens());
		
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
			String temp =tokenizer.nextToken();
			if(temp.equals("and"))
				count++;
		}
		System.out.println(count);
	}

}
