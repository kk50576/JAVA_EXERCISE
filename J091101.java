package tw.org.iii_3;

public class J091101 {

	public static void main(String[] args) {
	

	}

}

interface Brad641{
	void m1();
}
interface Brad642 extends Brad641{
	public void m2();
}
interface Brad643 extends Brad641,Brad642{//繼承介面可以多個 類別只能繼誠一個
	void m3();
}
class Brad544 implements Brad643{//類別實做(把方法定義出來)他
	public void m1(){}
	public void m2(){}
	public void m3(){}
	
}
