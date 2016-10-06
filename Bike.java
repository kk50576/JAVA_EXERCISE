package tw.org.iii_2;

public class Bike {
	// Field
	private double speed;
	static int count;
	
	// Constructor
	public Bike(){
		count++;
		speed = 1;
		System.out.println("Bike():" + speed);
	}
	
	void Bike(){
		
	}
	
	// Method
	protected void upSpeed(){
		speed = speed<1?1:speed*1.2;
	}
	void downSpeed(){
		speed = speed<1?0:speed*0.7;
	}
	double getSpeed(){
		return speed;
	}
	
	@Override
	public String toString() {
		return "Brad's Bike";
	}
	
}
