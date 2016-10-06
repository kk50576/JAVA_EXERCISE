package tw.org.iii_2;

public class TWId {// 設定一類別
	private String id = null;// 字串屬性
	static String check = "ABCDEFGHJKLMNPQRSTUVXYWZIO";// 整個類別都可以用
	// 建構式 產生物件實體之後的'初始化'

	TWId() {
		this((int) Math.random() * 2 == 0, (int) (Math.random() * 26));
	}

	TWId(boolean gender) {
		this(gender, (int) (Math.random() * 26));
	}

	TWId(int area) {
		this((int) Math.random() * 2 == 0, area);
	}

	TWId(boolean gender, int area) {
		StringBuffer temp=new StringBuffer(check.substring(area,area+1));
		temp.append(gender?"1":"2");
		System.out.println(temp.toString());
		// String c0=check.substring(area, area-1);
		// String c1=gender?"1":"2";
		// String c2=""+(int)(Math.random()*10);
		////id = check.substring(area, area + 1);
		////id += gender ? "1" : "2";
		for (int i = 0; i < 7; i++) {// 前九碼
			temp.append((int) (Math.random() * 10));
		////	id += (int) (Math.random() * 10);
		}
		for (int i = 0; i < 10; i++) {// 最後一碼
			if(isRight(temp.toString()+i)){
			id=temp.append(i).toString();
			}
		////	if (isRight(id + i)) {
		////		id = id + i;
				break;

			}
		}
	
	TWId(String id) {
		this.id = id;// id=id2即可
	}

	// 傳回身分證字串
	String getId() {
		return id;
	}

//	// 傳回性別
	boolean getGender() {
		return id.charAt(1) == '1';
	}

//	// 傳回地區
		String getArea() {
		return "台中市";
	}

	// 是否正確=>通過驗證
	static boolean isRight(String testId) {
		boolean ret = false;
		if (testId.matches("^[A-Z][12][0-9]{8}$")) {// ^$:比對完整字串
			ret = true;
			// not yet-->precheck
			int n12 = check.indexOf(testId.charAt(0)) + 10;// 從ID拿出一個字元
															// 看是在哪一個位子+10=表上的位子
			int n1 = n12 / 10;// 取出兩位數中的十位數
			int n2 = n12 % 10;// 取出個位數
			// B120863158
			int n3 = Integer.parseInt(testId.substring(1, 2));
			int n4 = Integer.parseInt(testId.substring(2, 3));
			int n5 = Integer.parseInt(testId.substring(3, 4));
			int n6 = Integer.parseInt(testId.substring(4, 5));
			int n7 = Integer.parseInt(testId.substring(5, 6));
			int n8 = Integer.parseInt(testId.substring(6, 7));
			int n9 = Integer.parseInt(testId.substring(7, 8));
			int n10 = Integer.parseInt(testId.substring(8, 9));
			int n11 = Integer.parseInt(testId.substring(9, 10));
			int total = n1 * 1 + n2 * 9 + n3 * 8 + n4 * 7 + n5 * 6 + n6 * 5 + n7 * 4 + n8 * 3 + n9 * 2 + n10 * 1
					+ n11 * 1;
			System.out.println(total);
			ret = total % 10 == 0;
		} else {
			ret = false;
		}
		return ret;
	}

	static boolean preCheck(String testId) {
	
		boolean isOK = false;
		if (testId.matches("")) {
			isOK = true;
		}
		return isOK;
	}

}
