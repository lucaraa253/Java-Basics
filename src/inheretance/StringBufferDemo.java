package inheretance;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Default capacity : " + sb.capacity());
		
		System.out.println(sb.length());
		
		sb.append(" Richard");
		System.out.println("Length after adding Richard : " + sb.length());
		System.out.println("Current capacity : " + sb.capacity());
		
		sb.append("pppppppp");
		System.out.println("Length after adding ppppppppp : " + sb.length());
		System.out.println("New capacity : " + sb.capacity());
		
		sb.append("ppo");
		System.out.println("Length after adding ppo : " + sb.length());
		System.out.println("New capacity : " + sb.capacity());

		
		sb.append("ppppppppppppppppppppppppppp");
		System.out.println("Length after adding pppppppppppppppppppppppppppppp : " + sb.length());
		System.out.println("New capacity : " + sb.capacity());

	}

}
