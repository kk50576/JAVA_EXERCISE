package tw.org.iii;

public class J_0820_質數 {
	public static void main(String[] args) {// TODO
		boolean flag = true;
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + "\t");
			if (i % 10 == 0) {
				System.out.println(); // 換行
			}
			for (int k = 2; k < 100; k++) {
				if (i % k == 0) {
					flag = false;
					break;
				}
				System.out.print(i + (flag ? "*" : "") + "\t");
			}
			
		}
	}
}
//		for (int j = 0; j < 10; j++) {
//			for (int i = 1; i <= 10; i++) {
//				int v = j * 10 + i;
//				// 但斷是否為質數
//				boolean isOK = true;
//				for (int k = 2; k <= v / 2; k++) {
//					if (v % k == 0) {
//						// no
//						isOK = false;
//						break;
//					}
//
//				}
//				System.out.print(v + (isOK ? "*" : "") + "\t");
//			}
//			System.out.println();
//		}
//	}
//
//}