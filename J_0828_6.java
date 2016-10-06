package tw.org.iii_2;

public class J_0828_6 {

	public static void main(String[] args) {
		Brad391 obj1=new Brad391();
		//Brad392 obj2=new Brad392();//抽象物件 不可能具體化
		Brad392 obj2=new Brad393();//由子類別做出來的 裡面沒有m3
		Brad393 obj3=new Brad393();
		Brad393 obj4=(Brad393)obj2;//強制轉型為393  裡面有m3 多行的行別轉換
	    obj4.m3();

		
	}
}

class Brad391{
	void m1(){}
	void m2(){}
}

abstract class Brad392{//裡面有抽象方法的必須宣告為抽象類別，若裡面沒有 也可以
	Brad392(){System.out.println("Brad392建構式");}//抽象類別無法直接建構出物件實體 但仍然可以定義自己的建構式:給子類別拿去用的
	void m1(){System.out.println("Brad392:m1");}
	abstract void m2();//只定義不實作
}


class Brad393 extends Brad392{//紅字: 未實做初抽象類別//取父類別的建構式
	void m2(){System.out.println("Brad393:m2()");}
	void m3(){System.out.println("Brad393:m3()");}
}

final class Brad394{//不可作繼承 不會既抽象又FINAL
	
}
