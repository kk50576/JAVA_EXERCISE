package tw.org.iii_1;

public class Bike {
	//fields屬性
	private double speed;//不能存取 屬性

	//constructor慣例:放於屬性在方法中間
	Bike(){
		speed=1;
		System.out.println("Bike()"+speed);//只做一次不會再呼叫
	}
	
	
	
	//method
	void upSpeed(){  //定義方法
		speed =speed<1?1:speed*1.2;
	}
	void downSpeed(){
		speed =speed<1?0:speed*0.7;
	}
	double getspeed(){
	return speed;	
	}
	
	}
	
	

