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

//序列化
class student implements Serializable{//學生類別物件  //必須宣告實作可續列化:serialzable(不用實作)
	int ch;
	transient int en;//仍然有此屬性 物件行別加上的話會是NULL
	int math;//基本型別
	String name;//物件行別
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


class PM implements Serializable{//類別屬性也須宣告實作序列化 去API看這個實作是否有實作序列化
	
}