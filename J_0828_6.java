package tw.org.iii_2;

public class J_0828_6 {

	public static void main(String[] args) {
		Brad391 obj1=new Brad391();
		//Brad392 obj2=new Brad392();//��H���� ���i������
		Brad392 obj2=new Brad393();//�Ѥl���O���X�Ӫ� �̭��S��m3
		Brad393 obj3=new Brad393();
		Brad393 obj4=(Brad393)obj2;//�j���૬��393  �̭���m3 �h�檺��O�ഫ
	    obj4.m3();

		
	}
}

class Brad391{
	void m1(){}
	void m2(){}
}

abstract class Brad392{//�̭�����H��k�������ŧi����H���O�A�Y�̭��S�� �]�i�H
	Brad392(){System.out.println("Brad392�غc��");}//��H���O�L�k�����غc�X������� �����M�i�H�w�q�ۤv���غc��:���l���O���h�Ϊ�
	void m1(){System.out.println("Brad392:m1");}
	abstract void m2();//�u�w�q����@
}


class Brad393 extends Brad392{//���r: ���갵���H���O//�������O���غc��
	void m2(){System.out.println("Brad393:m2()");}
	void m3(){System.out.println("Brad393:m3()");}
}

final class Brad394{//���i�@�~�� ���|�J��H�SFINAL
	
}
