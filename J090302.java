package tw.org.iii_3;

import java.io.File;

public class J090302 {

	public static void main(String[] args) {
		File f1=new File("C:/test");//�غc���A\\�i�H��/���N �A\t�|�{���O����ۤ�
		File f2=new File("C:/king");
		//�S��import�i�H�o�˼g: java.io.File f1=new java.io.File("")
		
		if(f2.exists()){
			System.out.println("f1 ok");
		}
		else {
			System.out.println("f1 NO");
		}

	}

}
