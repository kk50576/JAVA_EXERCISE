package tw.org.iii_3;
import java.io.File;

public class J090306 {

	public static void main(String[] args) {
		
   File[] roots=File.listRoots();
   for(File root:roots){//��X�C�@�Ӹ�
	   System.out.println(root.getAbsolutePath());
   }
	}

}
