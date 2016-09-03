package tw.org.iii_3;
import java.io.File;

public class J090306 {

	public static void main(String[] args) {
		
   File[] roots=File.listRoots();
   for(File root:roots){//找出每一個跟
	   System.out.println(root.getAbsolutePath());
   }
	}

}
