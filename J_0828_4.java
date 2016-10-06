package tw.org.iii_2;
public class J_0828_4 {
	public static void main(String[] args) {
		final int d;//區域變數
		d=12;//不能第二次給值
		System.out.println(Brad376.a);
	}
}
interface Brad371{void m1();}
interface Brad372{void m2();}//都是public的
class Brad373 implements Brad371,Brad372{
	public void m1(){}
	public void m2(){}
}
interface Brad374 extends Brad371{//介面可以(只能)繼成介面
	void m3();//因為介面沒有做初始化 故A要先給值
}
interface Brad375 extends Brad371,Brad372{//可以繼成多個介面
	int a=10;//必須給值 public final
	void m3();//public
}

class Brad376 implements Brad375{//需實作以下三個
	int b;
	final int c;//FINAL只能給值一次  屬性!!
	
	Brad376(){c=12;}//建構式
	@Override
	public void m1() {
		b++;
	//	a=1;//final
	}
	@Override
	public void m2() {
	}
	@Override
	public void m3() {
	}
	
}