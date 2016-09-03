package tw.org.iii_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class J090310 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/staff.csv");
			InputStreamReader irs =new InputStreamReader(fin);//ire is a reader
			BufferedReader br=new BufferedReader(irs);// br is a buffer reader
			

			
			String line=br.readLine();//readline:一行一行獨
			String[] row=line.split(",");
			System.out.println(row.length);
			for(String data:row){
				System.out.println(data);
			}
			
			fin.close();
			
		} catch (Exception e) {
			
		}
		

	}

}
