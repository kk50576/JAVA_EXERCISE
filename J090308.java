package tw.org.iii_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class J090308 {

	public static void main(String[] args) {
		File f1=new File("dir1/J03");//�إߪ���
		try {
			FileOutputStream fout=new FileOutputStream(f1,true);//+'true':���G�|�ɦb�᭱
			fout.write("Hello Brad2".getBytes());//�N�����ন***BYTE�}�C�ǰe�X�h
			fout.flush();//�����i�H����
			fout.close();
			System.out.println("OK");
			
		} catch (Exception e) {
			System.out.println("e.toString");
		}
		

}
}