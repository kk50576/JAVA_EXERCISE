package tw.org.iii_3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class J090305 {

	public static void main(String[] args) {
		
   File f1=new File("dir1\\J01");
   //用一個大空間一次讀初所有檔案
   long len=f1.length();//陣列最多到INT 
   try {
	FileInputStream fin =new FileInputStream(f1);
	
	int c; byte[] temp=new byte[(int)len];//中文字是3 byte  
	fin.read(temp);
	System.out.println(new String(temp));
	
//	while((c=fin.read(temp))!=-1){//buffer的概念
//		System.out.print(new String(temp,0,c));//讀取0-c個
//	}
	
//	int c1 =fin.read();//read next byte
//	System.out.println((char)c1);
//	int c2 =fin.read();
//	System.out.println((char)c2);
//	int c3 =fin.read();
//	System.out.println((char)c3);
	
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


