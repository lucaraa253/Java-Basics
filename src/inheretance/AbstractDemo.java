package inheretance;


abstract class Vehicle1{
	
	int price;
	
	abstract void start();
	
	abstract void stop();
	
	abstract void playMusic();
	
	public void applyingBreak() {
		System.out.println("Applying break should stop the vehicle");
	}
	
	
}

abstract class Car1 extends Vehicle1{

	abstract void turnOnBlueTooth();
	
	@Override
	void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void playMusic() {
		System.out.println("Music started playing");
		
	}
	
}

class Hyundai extends Car1{

	@Override
	void turnOnBlueTooth() {
		
		
	}
	
	abstract void remoteStart();
	
}

class Bike extends Vehicle1{

	@Override
	void start() {
		System.out.println("You need to pedal the bike to start it");
		
	}

	@Override
	void stop() {
		System.out.println("Use the break and kick stand to stop the bike");
		
	}

	@Override
	void playMusic() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractDemo {
	
	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.start();
		b.stop();
		b.applyingBreak();
		
	}
	
}
