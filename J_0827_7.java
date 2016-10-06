package tw.org.iii_2;

public class J_0827_7 {

	public static void main(String[] args) {
		Brad332 obj1=new Brad332();//this從該物件開始看起
		//obj1.m1();//inheritence
		obj1.m1(3);
		//obj1.m2();

	}

}
class Brad331{
	int a;
	void m1(){System.out.println("Brad331.m1()");a++;}
}

class Brad332 extends Brad331{
	int a;
//	void m1(){
//		super.m1();//作繼承在補強 和建構式不同 不一定要先做 可調換順續
//		System.out.println("Brad332.m1()");}
	void m1(int a){//overload
		System.out.println(super.a);
		System.out.println(this.a);
		super.m1();
		System.out.println(super.a);
		System.out.println(this.a);
		a++;//m1的 =3+1
		System.out.println("-------------------");
		System.out.println(super.a);
		System.out.println(this.a);
		System.out.println(a);
		
//		System.out.println("Brad332.m1(int)"+ this.a++);
	}
	void m2(){System.out.println("Brad332.m2()");}
}

