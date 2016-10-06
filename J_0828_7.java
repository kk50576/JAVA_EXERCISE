package tw.org.iii_2;

public class J_0828_7 {

	public static void main(String[] args) {
		Brad401 obj1=new Brad401();
		Brad402 obj2=new Brad402();
		Brad401 obj3=new Brad402();//用跑車給我一台車
		//Brad402 obj4=new Brad401();//***
		obj1.m1();
		obj2.m1();
		obj3.m1();//401有m1方法 方法有沒有呼叫是看類別有沒有此方法 執行實是看物件實體

	}

}

class Brad401{
	int a=1;
	void m1(){System.out.println("401:m1:"+a);}
}

class Brad402 extends Brad401{//override
	int a=2;
	void m1(){System.out.println("402:m1:"+a);}
	void m2(){System.out.println("402:m2");}//obj3不能用 因為是401
}