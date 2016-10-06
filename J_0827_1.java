package tw.org.iii_2;

public class J_0827_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	//洗牌
		int[] poker=new int[52];
		int rand;
		int[] temp=new int[52];//暫存	
		for(int j=0;j<poker.length;j++){
		poker[j]=j+1;
		}	
		
//		for(int c:poker){
//		System.out.println(c);
//		}
		
//		for(int i=0;i<poker.length;i++){     //隨機取一張派和第一張交換
//			rand=(int)(Math.random()*(poker.length));		
//			temp[i]=poker[rand];
//			poker[rand]=poker[i];
//			poker[i]=temp[i];	
//			System.out.println(poker[i]);
//		}

		for (int i=poker.length;i>0;i--){
			rand=(int)(Math.random()*i);
			temp[i-1]=poker[rand];
			poker[rand]=poker[i-1];
			poker[i-1]=temp[i-1];	
			System.out.println(poker[i-1]);	
		}
	}
}


