package inheretance;

class Vehicle{
	String color;
	int noOfWheels;
	String model;
	
	Vehicle(){
		
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void drive() {
		System.out.println("The vehicle drives down the street");
	}
}

class Truck extends Vehicle{
	
	Truck(String color, int noOfWheels, String model){
		super.color=color;
		super.noOfWheels=noOfWheels;
		super.model=model;
	}
	
	public void display() {
		System.out.println("The trucks color is : " + color);
		System.out.println("The truck has " + noOfWheels + " wheels");
		System.out.println("The trucks model is a " + model);
	}
	
	public void drive() {
		System.out.println("The truck drives down the street");
	}
	
	public void startVehicle() {
		System.out.println("The truck was started by turning a key");
	}
	
	public void showColor() {
		System.out.println("The trucks color is " + this.color);
	}
	
	public void showWheels() {
		System.out.println("The truck has " + this.noOfWheels + " wheels");
	}
}

class Bus extends Vehicle{
	
	Bus(String color, int noOfWheels, String model){
		
		super.color=color;
		super.noOfWheels=noOfWheels;
		super.model=model;
	}
	
	public void display() {
		System.out.println("The bus' color is : " + color);
		System.out.println("The bus has " + noOfWheels + " wheels");
		System.out.println("The bus' model is a " + model);
	}
	
	public void drive() {
		System.out.println("The bus drives down the street");
	}
	
	public void startVehicle() {
		System.out.println("The bus was started by turning a key");
	}
}

class Car extends Vehicle{
	
	Car(String color, int noOfWheels, String model){
		
		super.color=color;
		super.noOfWheels=noOfWheels;
		super.model=model;
	}
	
	public void display() {
		System.out.println("The cars color is : " + color);
		System.out.println("The car has " + noOfWheels + " wheels");
		System.out.println("The cars model is a " + model);
	}
	
	public void drive() {
		super.drive();
		System.out.println("The car drives down the street");
	}
	
	public void startVehicle() {
		System.out.println("The car was started by pushing a button");
	}
}


public class Road {
	public static void main(String[] args) {
		Truck t = new Truck("blue", 4, "cyber truck");
		t.showColor();
		t.drive();
		t.startVehicle();
		t.showWheels();
		Vehicle v = new Vehicle();
		v.drive();
		Car c = new Car("white", 4, "tesla");
		
		c.startVehicle();
		c.display();
		c.drive();
		
	}
}


