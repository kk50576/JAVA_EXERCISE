package tw.org.iii_2;

public class J_0827_5 {

	public static void main(String[] args) {
		// TODO Auto-generated 
		String a="0123";

//		System.out.println(a.concat("Brad"));
//		System.out.println(a);//本身不會變!!
//		System.out.println(a.replace('2', 'j'));//將2換成J
//		System.out.println(a);//本身不會變
		
		StringBuffer sb1=new StringBuffer();//常變動用此 效能較好 固定不便就用string
		System.out.println(sb1.capacity());
		sb1.append("123456789012345678901234567890");//override to string
		System.out.println(sb1.capacity());
		sb1.append("1234567890");//override to string
		System.out.println(sb1.capacity());

	}

}
