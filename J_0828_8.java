package tw.org.iii_2;

public class J_0828_8 {

	public static void main(String[] args) {
		int a=10,b=3;
		int[] c={1,2,3};
		try{
			System.out.println(a/b);
			System.out.println(c[4]);
		}
		
		catch( ArithmeticException ae){//除以分母為零
			System.out.println("Brad");
		}
		catch( ArrayIndexOutOfBoundsException e2){//陣列超出範圍
			System.out.println("III");
		}
		catch(RuntimeException re){//不知道出錯在哪時用
			System.out.println("bbb");
		}	
		//System.out.println("OK");
	}
}
