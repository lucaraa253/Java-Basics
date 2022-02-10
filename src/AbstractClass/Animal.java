package AbstractClass;

public abstract class Animal {
	
	String picture;
	String food;
	String Hunger;
	
	
	public void makeNoise() {
		System.out.println("Animal makes noise");
	}
	
	public void eat() {
		System.out.println("Animal eats");
	}
	
	abstract void sleep();
	
	public void roam() {
		System.out.println("Animal roams");
	}

	public static void main(String[] args) {
		

	}

}
