package tw.org.iii_3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class J090305 {

	public static void main(String[] args) {
		
   File f1=new File("dir1\\J01");
   //�Τ@�Ӥj�Ŷ��@��Ū��Ҧ��ɮ�
   long len=f1.length();//�}�C�̦h��INT 
   try {
	FileInputStream fin =new FileInputStream(f1);
	
	int c; byte[] temp=new byte[(int)len];//����r�O3 byte  
	fin.read(temp);
	System.out.println(new String(temp));
	
//	while((c=fin.read(temp))!=-1){//buffer������
//		System.out.print(new String(temp,0,c));//Ū��0-c��
//	}
	
//	int c1 =fin.read();//read next byte
//	System.out.println((char)c1);
//	int c2 =fin.read();
//	System.out.println((char)c2);
//	int c3 =fin.read();
//	System.out.println((char)c3);
	
	fin.close();
	System.out.println("OK");
	
} catch (FileNotFoundException fe) {//�i������IO�����Υi
	System.out.println(f1.toString()+"NO");
}
   catch (IOException ie) {
	   System.out.println(f1.toString());	
   }
   
   }
	}


