package tw.org.iii_3;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class J091102 {

	public static void main(String[] args) {
//		HashSet<String> set =new HashSet<>();//�@�}�l�N�n�w�q�i�H��J����ƫ��O
//		set.add("brad");
//		LinkedList<Integer> list=new LinkedList<>();//�x��
//		list.add(12);//�e���w�q�@��� �G�u�����
		String ans=createAnswer2(4);//�X�X�X
		System.out.println(ans);
		
	}

static String createAnswer(int n){
	HashSet<Integer> set =new HashSet<>();
	while(set.size()< n){
		set.add((int)(Math.random()*10));
	}
	StringBuffer sb=new StringBuffer(n);//�`�n�ܰʶ���BUFFER(16)
	for(Integer i:set) sb.append(i);//for each�N����J
	return sb.toString();
}



static String createAnswer2(int n){
 LinkedList<Integer> list=new LinkedList();
 for(int i=0;i<10;i++)
	 list.add(i,i);//��Ʀr��iLIST��,�ĴX�ө�X
 
	 Collections.shuffle(list);//�~�P collections���U
	 StringBuffer sb=new StringBuffer(n);
	 for(int i=0;i<n;i++) sb.append(list.get(i));
	 return sb.toString();
 


}
}

//class Student<E>{//�x���ƻ򤸯�
//	E a,b,c;
//	E getScore(){
//		return a+b+c;
//	}
//}

//class Student2{
//	Double a,b,c;
//	Double getScore(){
//		return a+b+c;
//	}
//}