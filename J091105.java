package tw.org.iii_3;

import tw.org.iii_3.Brad681.Brad682;

public class J091105 {
//�u�Q�n��{�X��������S�x:�@�w�n�~��THREAD!!!!
	public static void main(String[] args) {
		 Brad681 obj1=new Brad681("A",200);//���ǰѼƪ��غc��
		 Brad681 obj2=new Brad681("B",300);
		 Brad682 obj3=new Brad682("C",150);
		 Thread t3=new Thread(obj3);
		 obj1.start();//�@�w�n�I�sSTART ��{�ͩR�g�� ������~��START��k �|�h��RUN��k�ӹ�@//obj1.run();	
		 obj2.start();//���O�}�l�h��{�ͩR �ӬO�i�H�}�l�h"����" ��CPU�@���(���O���W����)
		 t3.start();
		 try{
			 obj2.join();//
		 }catch(InterruptedException e){
			 
		 }
	     System.out.println("main");//��ɰ���??
	}
}

class Brad681 extends Thread{//�~�ӥu��@�� �u��h��@�h�Ӥ����F �G�X�R�ʸ��C
	private String name;
	private int delay;
	Brad681(String name,int delay)
		{this.name=name;
		this.delay=delay;}
	@Override//�w�q���O�s�b���N�q
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100);//���j0.1��
			} catch (InterruptedException e) {//��!�٨S�ο��N�Q�s��
				
			}
		}
	}
	
	class Brad682 implements Runnable{//��������ĤG�سB�z�Ҧ�  �~�Ӫ����@RUNNABLE�G���O�����
		private String name;
		private int delay;
		Brad682(String name,int delay)
			{this.name=name;
			this.delay=delay;}
		@Override//�w�q���O�s�b���N�q
		public void run(){
			for(int i=0;i<10;i++){
				System.out.println(name+":"+i);
				try {
					Thread.sleep(100);//���j0.1��
				} catch (InterruptedException e) {//��!�٨S�ο��N�Q�s��
					
				}
			}
		}
	}
}
