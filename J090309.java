package tw.org.iii_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class J090309 {

	public static void main(String[] args) {
		File f1=new File("dir1/J01");
		try {
			FileReader reader=new FileReader(f1);//reader¸û¾A¦XÅª¤å¦rÀÉ
			int c;
			while((c=reader.read())!=-1){
				System.out.print((char)c);
			}
			reader.close();
		} catch (Exception e) {
			
		}

	}

}
