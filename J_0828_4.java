package tw.org.iii_2;
public class J_0828_4 {
	public static void main(String[] args) {
		final int d;//�ϰ��ܼ�
		d=12;//����ĤG������
		System.out.println(Brad376.a);
	}
}
interface Brad371{void m1();}
interface Brad372{void m2();}//���Opublic��
class Brad373 implements Brad371,Brad372{
	public void m1(){}
	public void m2(){}
}
interface Brad374 extends Brad371{//�����i�H(�u��)�~������
	void m3();//�]�������S������l�� �GA�n������
}
interface Brad375 extends Brad371,Brad372{//�i�H�~���h�Ӥ���
	int a=10;//�������� public final
	void m3();//public
}

class Brad376 implements Brad375{//�ݹ�@�H�U�T��
	int b;
	final int c;//FINAL�u�൹�Ȥ@��  �ݩ�!!
	
	Brad376(){c=12;}//�غc��
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