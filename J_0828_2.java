package tw.org.iii_2;

public class J_0828_2 {

	public static void main(String[] args) {
		Brad354 car=new Brad354();
		Brad352 t1=new Brad352();
		Brad353 t2=new Brad353();
		car.m1(t2);
	}
}
interface Brad351{//沒說 都是public
	void m1();//介面 都需要時做一方法
	void m2();//不能有定義 只是規格
}

class Brad352 implements Brad351{
	public void m1(){System.out.println("Brad352:M1");}//有實做
	public void m2(){System.out.println("Brad352:M2");}
	void m3(){System.out.println("Brad351:M3");}
}

class Brad353 implements Brad351{
	public void m1(){System.out.println("Brad353:M1");}//有實做
	public void m2(){System.out.println("Brad353:M2");}
	void m4(){System.out.println("Brad353:M4");}
}

class Brad354{
	void m1(Brad351 obj1){
		obj1.m1();
		obj1.m2();
		
	}
}