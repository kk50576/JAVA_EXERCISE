package tw.org.iii_2;
 class J_0828_10 {
//Exception call stack
	public static void main(String[] args){
		Brad433 obj1=new Brad433();
		try{
			obj1.m3();//����TRY
		}
		catch (Exception ee){
		}
	}
}


class Brad431{
	void m1() throws Exception{
			throw new Exception();
	}
}

class Brad432 extends Brad431{
	void m2() throws Exception{//�ߵ�
		m1();
	}
}

class Brad433 extends Brad432{//�ߵ�MAIN
	void m3() throws Exception{
		m2();
}
}



