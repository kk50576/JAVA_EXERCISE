package tw.org.iii_3;

import java.io.File;

public class J090302 {

	public static void main(String[] args) {
		File f1=new File("C:/test");//建構式，\\可以用/替代 ，\t會認為是跳脫自元
		File f2=new File("C:/king");
		//沒有import可以這樣寫: java.io.File f1=new java.io.File("")
		
		if(f2.exists()){
			System.out.println("f1 ok");
		}
		else {
			System.out.println("f1 NO");
		}

	}

}
