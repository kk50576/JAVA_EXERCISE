package tw.org.iii_1;

import javax.swing.JOptionPane;

public class GuessNumber {

	public static void main(String[] args) {
		// 產生謎底
		String answer = createAnswer();
		System.out.println(answer);
		int[] poker = new int[4];// 0,0,0.....0
		for (int i = 0; i < 10; i++) {
			boolean isOK;
			int rand;
//			do {                // 檢查是否重複
//				rand = (int) (Math.random() *10);
//				isOK = true;
//				for (int j = 0; j < i; j++) {
//					if (poker[j] == rand) {
//						isOK = false;
//						break;
//					}
//				}
//			} while (isOK == false);// 有分號!!

			//poker[i] = rand;
			// System.out.println(poker[i]);
		}
//		String ret = "";
//		for(int v:poker) ret+=v;
//		return ret;
	
// 開始猜
		boolean isWinner=false;
		for (int i = 0; i < 10; i++) {
			String guess = JOptionPane.showInputDialog("guess");
			if (guess.equals(answer)) {
				isWinner=true;
				JOptionPane.showMessageDialog(null, "恭喜");
				break;
			}

			else {
				String result=checkAB(answer,guess);
				JOptionPane.showMessageDialog(null,guess+":"+result);
			}
		}
		if (!isWinner){
			JOptionPane.showMessageDialog(null, "答案是"+answer);
		}
	}
//比對 幾A幾B
	static String checkAB(String a,String g){
		int A,B;A=B=0;
		for(int i=0;i<g.length();i++){
			if(g.charAt(i)==a.charAt(i)){//g的第I個==a的第I個
				A++;
			}
			else if(a.indexOf(g.charAt(i))>=0){//G的第I個出現在A當中
				B++;
			}
		}
		return A+"A"+B+"B";
	}
	
//產生答案
	static String createAnswer() {
		return "734";
	}
}
