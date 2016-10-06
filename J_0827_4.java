package tw.org.iii_2;

public class J_0827_4 {// 嘿囊

	public static void main(String[] args) {// public:JAVA程摸Θ琌
	//	Brad301 obj1 = new Brad301();
		Brad302 obj2= new Brad302("AA");
	}

}

class Brad301 {
//	Brad301() {
//		System.out.println("A");
//	}
	Brad301(int a) {// 计 
		System.out.println("B");
	}
//	Brad301(byte a) {// 计 
//		System.out.println("c");
//	}
}

class Brad302 extends Brad301{
	Brad302(){
		//super();
		super(1);//㊣摸 Τ肚把计INT篶Α
		System.out.println("D");
	}
	Brad302(int a){
		//super()	
		this();//㊣BRAD1
		System.out.println("E");
	}
	Brad302(String b){
		this(1);
		System.out.println("F");
	}
}



