package tw.org.iii_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//����ǦC��:�ǦC�ƪ����ݩ�! ��k...�ۤv�|�h��
public class J090314_read {
	public static void main(String[] args) {
		try {
			ObjectInputStream oin=new ObjectInputStream(new FileInputStream("dir1/student.brad"));
			
			Object obj1=oin.readObject();//�|�Ǧ^����
			student s1=(student)obj1;//�૬�����ǥ� �ǥͬO�q��y����̨ӤF �S��NEW�X
			
			student s2=(student)(oin.readObject());//�૬�����ǥ� �ǥͬO�q��y����̨ӤF �S��NEW�X
			
			oin.close();
			
			System.out.println(s1.name+s1.calTotal());
			System.out.println(s2.name+s2.calTotal());
			
		} catch (Exception e) {//�Y�n�B�z��ӥH�W�i�H��|(��) �����l���Y����
			System.out.println(e.toString());
		} 
		}
	}

