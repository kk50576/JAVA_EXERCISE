package tw.org.iii_2;

public class J_0827_4 {// �W�٦P�ҦW

	public static void main(String[] args) {// public:�@��JAVA�̦h�@�ӥD���O���O
	//	Brad301 obj1 = new Brad301();
		Brad302 obj2= new Brad302("AA");
	}

}

class Brad301 {
//	Brad301() {
//		System.out.println("A");
//	}
	Brad301(int a) {// �Ӽ� ���O
		System.out.println("B");
	}
//	Brad301(byte a) {// �Ӽ� ���O
//		System.out.println("c");
//	}
}

class Brad302 extends Brad301{
	Brad302(){
		//super();
		super(1);//�I�s�����O ���ǰѼ�INT���غc��
		System.out.println("D");
	}
	Brad302(int a){
		//super()	
		this();//�I�s�W����BRAD1
		System.out.println("E");
	}
	Brad302(String b){
		this(1);
		System.out.println("F");
	}
}



