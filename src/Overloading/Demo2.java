package Overloading;

class Food {

}

class Pizza extends Food {

}

class Burger extends Food {

}

class Animal {
	int age;

	public Food eat() {
		System.out.println("Animal must eat to survive");
		return null;
	}

	public void sleep() {
		System.out.println("Animal should sleep");
	}

	public static void doWork() {
		System.out.println("Animal do work called");
	}
}

class Cat extends Animal {
	public Pizza eat() {
		super.eat();
		System.out.println("Cat east fish");
		return null;
	}
}

class Dog extends Animal {
	public Pizza eat() {
		System.out.println("Dog eats meat");
		return null;
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.sleep();
		Dog d = new Dog();
		d.eat();
		c.sleep();
		
		Animal a = new Cat();
		a.eat();

	}

}
