package tw.org.iii_2;

public class J_0828_8 {

	public static void main(String[] args) {
		int a=10,b=3;
		int[] c={1,2,3};
		try{
			System.out.println(a/b);
			System.out.println(c[4]);
		}
		
		catch( ArithmeticException ae){//���H�������s
			System.out.println("Brad");
		}
		catch( ArrayIndexOutOfBoundsException e2){//�}�C�W�X�d��
			System.out.println("III");
		}
		catch(RuntimeException re){//�����D�X���b���ɥ�
			System.out.println("bbb");
		}	
		//System.out.println("OK");
	}
}
