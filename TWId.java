package tw.org.iii_2;

public class TWId {// �]�w�@���O
	private String id = null;// �r���ݩ�
	static String check = "ABCDEFGHJKLMNPQRSTUVXYWZIO";// ������O���i�H��
	// �غc�� ���ͪ�����餧�᪺'��l��'

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
		for (int i = 0; i < 7; i++) {// �e�E�X
			temp.append((int) (Math.random() * 10));
		////	id += (int) (Math.random() * 10);
		}
		for (int i = 0; i < 10; i++) {// �̫�@�X
			if(isRight(temp.toString()+i)){
			id=temp.append(i).toString();
			}
		////	if (isRight(id + i)) {
		////		id = id + i;
				break;

			}
		}
	
	TWId(String id) {
		this.id = id;// id=id2�Y�i
	}

	// �Ǧ^�����Ҧr��
	String getId() {
		return id;
	}

//	// �Ǧ^�ʧO
	boolean getGender() {
		return id.charAt(1) == '1';
	}

//	// �Ǧ^�a��
		String getArea() {
		return "�x����";
	}

	// �O�_���T=>�q�L����
	static boolean isRight(String testId) {
		boolean ret = false;
		if (testId.matches("^[A-Z][12][0-9]{8}$")) {// ^$:��粒��r��
			ret = true;
			// not yet-->precheck
			int n12 = check.indexOf(testId.charAt(0)) + 10;// �qID���X�@�Ӧr��
															// �ݬO�b���@�Ӧ�l+10=��W����l
			int n1 = n12 / 10;// ���X���Ƥ����Q���
			int n2 = n12 % 10;// ���X�Ӧ��
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
