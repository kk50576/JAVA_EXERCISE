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
		try {// ���O�������h�B�z??
			obj1.m1(2);// �j��@�w�n���ˬd TRY
		} catch (IllegalClassFormatException ie) {// ���ORUNTIME���ҥH�@�w�n��
		} catch (DatatypeConfigurationException de) {// ���ORUNTIME���ҥH�@�w�n��
		}
		Brad423 obj2=new Brad423();
		    obj2.m1(1);//?????

	}
}

class Bird {
	int leg;

	void setLeg(int n) {
		if (n < 0 || n > 2) {
			throw new RuntimeException();// �i�ߥX�ҥ~��Error
		}
		leg = n;
	}
}

// ****************************************************************//
class Brad421 {// �ƥ��ˬd
	void m1(int n) throws IllegalClassFormatException, DatatypeConfigurationException {// ���ŧi�|�ߥX�@�ҥ~�A�i�H�h��
		if (n < 0) {
			throw new IllegalClassFormatException();// �S��S
		} else if (n > 100) {
			throw new DatatypeConfigurationException();
		}
	}
}

class Brad422 extends Brad421 {// m1�S�ǰѼ�:���OOVERRIDE �O���s��
	void m1(int n) throws IllegalClassFormatException, // extends:�o�����j ���n���n����ˤ�
														// �p�ҥH��Exception����
			DatatypeConfigurationException {
		// super.m1(2);
	}

}

class Brad423 extends Brad421 {// m1�S�ǰѼ�:���OOVERRIDE �O���s��
	void m1(int n){
		int a=10,b=0;
		try{
			int c=a/b;
			return;//���|�LOK finally�����~�|��return
		}
		catch(RuntimeException re){
			System.out.println("catch");
			//return;
		}
		finally{
			System.out.println("finally");//�T�O������������!
		}//System.out.println("ok");
	}
	
	
}
