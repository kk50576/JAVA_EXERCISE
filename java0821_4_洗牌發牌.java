package tw.org.iii_1;

import java.util.Arrays;

public class java0821_4_洗牌發牌 {

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		System.out.println(begin);
		// 洗牌  HW
		int[] poker = new int[52];// 0,0,0.....0
		System.out.println("發牌後");

		for (int i = 0; i < poker.length; i++) {
			boolean isOK;
			int rand;
			do {// 檢查是否重複
				rand = (int) (Math.random() * poker.length);
				isOK = true;
				for (int j = 0; j < i; j++) {
					if (poker[j] == rand) {
						isOK = false;
						break;
					}
				}
			} while (isOK = false);//有分號!!

			poker[i] = rand;
			System.out.println(poker[i]);
		}
		// System.out.println(System.currentTimeMillis()-begin);計算效能
		System.out.println("++++++每人的牌++++");

		// 發牌:發到四個玩家手上
		int[][] player = new int[4][13];//一人13張牌
		for (int i = 0; i < poker.length; i++) {
			player[i % 4][i / 4] = poker[i];
		}
		for (int v : player[0]) {
			System.out.println(v);// 看某一家的牌
		}

		// 理牌-->攤牌
		// System.out.println("攤牌");
		// for(int k=0;k<=3;k++){
		// for (int v1:player[k]){
		// System.out.print(v1+"\t");
		// }System.out.println();
		// }
		// }
		// }
		System.out.println("攤牌");
		String[] suit={"黑桃","紅心","方塊","梅花"};
		String[] value={"A ","1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10","J ","Q ","K "};
		for (int[] c : player) {
			Arrays.sort(c);//sort
			for (int card : c) {
				System.out.print(suit[card/13] + value[card%13]+"  ");
			}
			System.out.println();
			
			
		}
		
		
	}
}
