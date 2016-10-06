package tw.org.iii_2;

public class J_0828_5 {

	public static void main(String[] args) {
		

	}
}

class Brad381{
	private void m1(){}//方法名稱 參數個數:override
	//若方法是private 沒有override的感覺:只能在裡面取用 382用super m1()也不可用
}
class Brad382 extends Brad381{//extend:發揚光大
	void m1(){}//存取範圍不可<父類別
}