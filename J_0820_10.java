package tw.org.iii;

public class J_0820_10 {

	public static void main(String[] args) {
		int[] p = new int[6];    //p[0]....p[5]=0;
		for (int j = 0; j < 10; j++) {
			int point = (int) (Math.random() * 9+1);// 0-5
			if(point ==7){
				p[3]++;
			}
			else if(point ==8){
				p[4]++;
			}
			else if(point ==9){
				p[5]++;
			}
			else p[point]++;		
		}
		for(int i=0;i<6;i++){
		System.out.println((i+1)+":"+p[i]);
		}
	}
}


//p[(point>=6?point-3:point)]++;
