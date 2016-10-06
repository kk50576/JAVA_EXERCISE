package tw.org.iii;

public class J_0820_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b =3 ;
		int c = a&b;
		System.out.println(c);

	if (a++ >= 10 & b-- <= 3) {     
		//若是二進位運算前後都要跑
		System.out.println("ok:a=" + a + "b=" + b);
		} else {
			System.out.println("xx:a=" + a + "b=" + b);
		  //布林運算最佳化b未執行
		}
	}

}
