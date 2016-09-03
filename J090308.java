package tw.org.iii_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class J090308 {

	public static void main(String[] args) {
		File f1=new File("dir1/J03");//建立空檔
		try {
			FileOutputStream fout=new FileOutputStream(f1,true);//+'true':結果會補在後面
			fout.write("Hello Brad2".getBytes());//將物件轉成***BYTE陣列傳送出去
			fout.flush();//本機可以不用
			fout.close();
			System.out.println("OK");
			
		} catch (Exception e) {
			System.out.println("e.toString");
		}
		

}
}