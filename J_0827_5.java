package tw.org.iii_2;

public class J_0827_5 {

	public static void main(String[] args) {
		// TODO Auto-generated 
		String a="0123";

//		System.out.println(a.concat("Brad"));
//		System.out.println(a);//�������|��!!
//		System.out.println(a.replace('2', 'j'));//�N2����J
//		System.out.println(a);//�������|��
		
		StringBuffer sb1=new StringBuffer();//�`�ܰʥΦ� �į���n �T�w���K�N��string
		System.out.println(sb1.capacity());
		sb1.append("123456789012345678901234567890");//override to string
		System.out.println(sb1.capacity());
		sb1.append("1234567890");//override to string
		System.out.println(sb1.capacity());

	}

}
