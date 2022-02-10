package inheretance;

interface Beverages{
	int cost=5;
	void prepareTea();
	default void mix() {
		System.out.println("Mix the beverages properly");
	}
	static void ratings() {
		System.out.println("Ratings for beverages");
	}
}

interface Games{
	void play();
	void pause();
}

interface modernGames extends Games{
	void graphics();
	void animations();
}

class Men extends Animal implements Beverages, modernGames{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		System.out.println("This dude loves video games");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepareTea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void graphics() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void animations() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Animal{
	int age;
	public int setAge(int age) {
		return age;
	}
	public void showAge() {
		System.out.println("The animal is " + age + " years old");
	}
	public abstract void eat();
	public void sleep() {
		System.out.println("Animal should sleep");
	}
}

class Cat extends Animal{
//	Method overriding
	int age;
	public void eat() {

		System.out.println("Cats eat fish");
	}
	public int setAge(int age) {
		return this.age= age;
	}
	
	public void showAge() {
		System.out.println("The cat is " + this.age + " years old");
	}
	
}

class Dog extends Animal{
	public void eat() {
		System.out.println("Dogs eat meat");
	}
}

public class Demo {
	public static void main(String[] args) {
		Men m = new Men();
		m.play();
		Cat c = new Cat();
		c.eat();
		c.sleep();
		c.setAge(7);
		c.showAge();
		Dog d = new Dog();
		d.eat();
	}
}
