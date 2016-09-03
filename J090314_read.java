package tw.org.iii_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//物件序列化:序列化物件的屬性! 方法...自己會去找
public class J090314_read {
	public static void main(String[] args) {
		try {
			ObjectInputStream oin=new ObjectInputStream(new FileInputStream("dir1/student.brad"));
			
			Object obj1=oin.readObject();//會傳回物件
			student s1=(student)obj1;//轉型成為學生 學生是從串流物件裡來了 沒有NEW出
			
			student s2=(student)(oin.readObject());//轉型成為學生 學生是從串流物件裡來了 沒有NEW出
			
			oin.close();
			
			System.out.println(s1.name+s1.calTotal());
			System.out.println(s2.name+s2.calTotal());
			
		} catch (Exception e) {//若要處理兩個以上可以用|(或) 有父子關係不行
			System.out.println(e.toString());
		} 
		}
	}

