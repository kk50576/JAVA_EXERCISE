package tw.org.iii_3;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class J093012 {

	public static void main(String[] args) {
		int a=123;
		boolean b=true;
		double c=12.3;
		
		try {
			DataOutputStream dout = new DataOutputStream(new FileOutputStream("dir1/data.dat"));
			dout.writeInt(a);
			dout.writeBoolean(b);
			dout.writeDouble(c);
			dout.flush();
			dout.close();
		} catch (Exception e) {
			
		}

	}

}
