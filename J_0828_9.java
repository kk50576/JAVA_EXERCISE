package tw.org.iii_2;

import java.lang.instrument.IllegalClassFormatException;
import javax.swing.tree.ExpandVetoException;
import javax.xml.datatype.DatatypeConfigurationException;

public class J_0828_9 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLeg(2);
			System.out.println(b1.leg);
		} catch (RuntimeException re) {
			System.out.println("NO");
		}
		//////////////////////////////////////////////
		Brad421 obj1 = new Brad421();
		try {// 類別本身不去處理??
			obj1.m1(2);// 強制一定要做檢查 TRY
		} catch (IllegalClassFormatException ie) {// 不是RUNTIME的所以一定要做
		} catch (DatatypeConfigurationException de) {// 不是RUNTIME的所以一定要做
		}
		Brad423 obj2=new Brad423();
		    obj2.m1(1);//?????

	}
}

class Bird {
	int leg;

	void setLeg(int n) {
		if (n < 0 || n > 2) {
			throw new RuntimeException();// 可拋出例外或Error
		}
		leg = n;
	}
}

// ****************************************************************//
class Brad421 {// 事先檢查
	void m1(int n) throws IllegalClassFormatException, DatatypeConfigurationException {// 先宣告會拋出一例外，可以多個
		if (n < 0) {
			throw new IllegalClassFormatException();// 沒有S
		} else if (n > 100) {
			throw new DatatypeConfigurationException();
		}
	}
}

class Brad422 extends Brad421 {// m1沒傳參數:不是OVERRIDE 是全新的
	void m1(int n) throws IllegalClassFormatException, // extends:發揚光大 不好的要比父親少
														// 小所以用Exception不行
			DatatypeConfigurationException {
		// super.m1(2);
	}

}

class Brad423 extends Brad421 {// m1沒傳參數:不是OVERRIDE 是全新的
	void m1(int n){
		int a=10,b=0;
		try{
			int c=a/b;
			return;//不會印OK finally做完才會做return
		}
		catch(RuntimeException re){
			System.out.println("catch");
			//return;
		}
		finally{
			System.out.println("finally");//確保全部都有做完!
		}//System.out.println("ok");
	}
	
	
}
