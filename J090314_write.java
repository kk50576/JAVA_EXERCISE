package tw.org.iii_3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class J090314_write {

	public static void main(String[] args) {
		student s1=new student(new PM(),"Dave",90,80,70);
		student s2=new student(new PM(),"Tony",49,86,70);
		System.out.println(s1.calTotal());
		System.out.println(s1.calAvg());
		
		try {
			ObjectOutputStream oot=new ObjectOutputStream(new FileOutputStream("dir1/student.brad"));
			
			oot.writeObject(s1);
			oot.writeObject(s2);
			oot.flush();
			oot.close();
		} catch (IOException e) {
			System.out.println(e.toString());
			
		}

	}

}

//�ǦC��
class student implements Serializable{//�ǥ����O����  //�����ŧi��@�i��C��:serialzable(���ι�@)
	int ch;
	transient int en;//���M�����ݩ� �����O�[�W���ܷ|�ONULL
	int math;//�򥻫��O
	String name;//�����O
	PM pm;
	student(PM pm,String name,int ch,int en,int math){//constructor
		this.name=name;
		this.ch=ch;
		this.en=en;
		this.math=math;
		this.pm=pm;
	}
	int calTotal(){return ch+en+math;}
	double calAvg(){return calTotal()/3.0;}
}


class PM implements Serializable{//���O�ݩʤ]���ŧi��@�ǦC�� �hAPI�ݳo�ӹ�@�O�_����@�ǦC��
	
}