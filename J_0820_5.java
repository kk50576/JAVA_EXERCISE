package tw.org.iii;

import javax.swing.JOptionPane;

public class J_0820_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stryear = JOptionPane.showInputDialog("輸入年分");
		String strmonth = JOptionPane.showInputDialog("輸入月分");
		int intyear = Integer.parseInt(stryear);
		int intmonth = Integer.parseInt(strmonth);
		System.out.println(intyear+"/"+strmonth);
	}

}
