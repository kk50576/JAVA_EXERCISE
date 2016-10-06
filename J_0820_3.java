package tw.org.iii;

public class J_0820_3 {

	public static void main(String[] args) {
		// switch
		int dir = 2;//-128~127 so case 128->compile error
		final int b =9;
		
		switch (b) { //不能是long
		default:
			System.out.println("X");
			//break;
		case 10:
			System.out.println("a");
			break;
		case 9:
			System.out.println("B");
			break;
		case b+2:
			System.out.println("B1");
			break;
		
		
		}

	}

}
