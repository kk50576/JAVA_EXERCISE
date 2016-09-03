package tw.org.iii_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J090313 {

	public static void main(String[] args) {
		try {
			DataInputStream din = new DataInputStream(new FileInputStream("dir1/data.dat"));
			int data1=din.readInt();//按照順序毒入就須按照順序寫出
			boolean data2=din.readBoolean();
			double data3=din.readDouble();
			
			din.close();
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
		} catch (Exception e) {
			
		}


	}

}
