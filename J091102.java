package tw.org.iii_3;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class J091102 {

	public static void main(String[] args) {
//		HashSet<String> set =new HashSet<>();//一開始就要定義可以放入的資料型別
//		set.add("brad");
//		LinkedList<Integer> list=new LinkedList<>();//泛型
//		list.add(12);//前面已訂一整數 故只能放整數
		String ans=createAnswer2(4);//出幾碼
		System.out.println(ans);
		
	}

static String createAnswer(int n){
	HashSet<Integer> set =new HashSet<>();
	while(set.size()< n){
		set.add((int)(Math.random()*10));
	}
	StringBuffer sb=new StringBuffer(n);//常要變動雇用BUFFER(16)
	for(Integer i:set) sb.append(i);//for each將直放入
	return sb.toString();
}



static String createAnswer2(int n){
 LinkedList<Integer> list=new LinkedList();
 for(int i=0;i<10;i++)
	 list.add(i,i);//把數字放進LIST中,第幾個放幾
 
	 Collections.shuffle(list);//洗牌 collections底下
	 StringBuffer sb=new StringBuffer(n);
	 for(int i=0;i<n;i++) sb.append(list.get(i));
	 return sb.toString();
 


}
}

//class Student<E>{//泛型甚麼元素
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