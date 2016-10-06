package tw.org.iii;

public class J_0820_8 {

	public static void main(String[] args) {
		brad: // 標籤與法緊黏回圈敘述句
		for (int j = 3; j > 0; j--) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i + "," + j);
				if (i == 1) {
					break brad;// 若無此行則不會編譯失敗
				}

			}

		}
	}
}
