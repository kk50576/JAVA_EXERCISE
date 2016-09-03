package tw.org.iii_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class J090307 {

	public static void main(String[] args) {
		File f1=new File("dir1\\J01");
		   try {
			FileInputStream fin =new FileInputStream(f1);
			int c;
			while((c=fin.read())!=-1){
				System.out.print((char)c);
			}
			
//			int c1 =fin.read();//read next byte
//			System.out.println((char)c1);
//			int c2 =fin.read();
//			System.out.println((char)c2);
//			int c3 =fin.read();
//			System.out.println((char)c3);
			
			fin.close();
			System.out.println("OK");
			
		} catch (FileNotFoundException fe) {//可直接給IO捕捉及可
			System.out.println(f1.toString()+"NO");
		}
		   catch (IOException ie) {
			   System.out.println(f1.toString());	
		   }
		   
		   }
	}


