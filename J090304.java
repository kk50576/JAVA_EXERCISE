package tw.org.iii_3;

import java.io.File;

public class J090304 {

	public static void main(String[] args) {
		File dir2=new File("dir1/dir3/dir4/dir5/dir6");
        if(!dir2.exists()){
        	if(dir2.mkdirs()){//true if and only if the directory was created
        		//+'s'父目錄不存在自動建
        		System.out.println("create dir 2");
        	}
        }
	}

}
