package tw.org.iii_1;

import java.util.Arrays;

public class java0821_4_�~�P�o�P {

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		System.out.println(begin);
		// �~�P  HW
		int[] poker = new int[52];// 0,0,0.....0
		System.out.println("�o�P��");

		for (int i = 0; i < poker.length; i++) {
			boolean isOK;
			int rand;
			do {// �ˬd�O�_����
				rand = (int) (Math.random() * poker.length);
				isOK = true;
				for (int j = 0; j < i; j++) {
					if (poker[j] == rand) {
						isOK = false;
						break;
					}
				}
			} while (isOK = false);//������!!

			poker[i] = rand;
			System.out.println(poker[i]);
		}
		// System.out.println(System.currentTimeMillis()-begin);�p��į�
		System.out.println("++++++�C�H���P++++");

		// �o�P:�o��|�Ӫ��a��W
		int[][] player = new int[4][13];//�@�H13�i�P
		for (int i = 0; i < poker.length; i++) {
			player[i % 4][i / 4] = poker[i];
		}
		for (int v : player[0]) {
			System.out.println(v);// �ݬY�@�a���P
		}

		// �z�P-->�u�P
		// System.out.println("�u�P");
		// for(int k=0;k<=3;k++){
		// for (int v1:player[k]){
		// System.out.print(v1+"\t");
		// }System.out.println();
		// }
		// }
		// }
		System.out.println("�u�P");
		String[] suit={"�®�","����","���","����"};
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
