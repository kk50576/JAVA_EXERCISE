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
interface Brad643 extends Brad641,Brad642{//�~�Ӥ����i�H�h�� ���O�u���~�ۤ@��
	void m3();
}
class Brad544 implements Brad643{//���O�갵(���k�w�q�X��)�L
	public void m1(){}
	public void m2(){}
	public void m3(){}
	
}
