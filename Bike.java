package tw.org.iii_1;

public class Bike {
	//fields�ݩ�
	private double speed;//����s�� �ݩ�

	//constructor�D��:����ݩʦb��k����
	Bike(){
		speed=1;
		System.out.println("Bike()"+speed);//�u���@�����|�A�I�s
	}
	
	
	
	//method
	void upSpeed(){  //�w�q��k
		speed =speed<1?1:speed*1.2;
	}
	void downSpeed(){
		speed =speed<1?0:speed*0.7;
	}
	double getspeed(){
	return speed;	
	}
	
	}
	
	

