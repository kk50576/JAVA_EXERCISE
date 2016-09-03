package tw.org.iii_3;

import java.io.File;
import java.io.IOException;

public class J090303 {

	public static void main(String[] args) {
		File f1=new File("dir1/J02");
		//System.out.println(f1.getAbsolutePath());
       if(f1.isFile()){
    	   System.out.println("exist");
       }
       else{
    	  try {
			if(f1.createNewFile()){
				System.out.println("create OK");
			}
			else{
				System.out.println("fail");
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		}//不處理要拋出例外
       }
	}


	
}
