package tw.org.iii_3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class J0911Racing extends JFrame {
	private JButton go;
	private JLabel[] lanes;// 跑到是陣列
	private int rank;
	private car[] cars;

	public J0911Racing() {
		setLayout(new GridLayout(9, 1));

		add(go = new JButton("GO"));
		lanes = new JLabel[8];
		for (int i = 0; i < lanes.length; i++) {
			add(lanes[i] = new JLabel((i + 1) + "."));// ?
		}

		setSize(1024, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		go.addActionListener(new ActionListener() {// GO按鍵的動作
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
	}

	private void go() {
		rank = 1;
		cars = new car[8];
		for (int i = 0; i < cars.length; i++) {// 清跑道
			cars[i] = new car(i);
		}
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new car(i);
		}
		for (int i = 0; i < cars.length; i++) {
			cars[i].start();
		}
	}

	private class car extends Thread {
		private int whichLane;

		car(int n) {
			whichLane = n;
		}

		@Override
		public void run() {
	       for(int i=0;i<100;i++){//寫建構是讓車子跑在正確的跑道
	    	   lanes[whichLane].setText(lanes[whichLane].getText()+">");//叫出原來在繼續畫>
	    	  if(i==99){//最後一個列印出名次
	    		//  lanes[whichLane].setText(lanes[whichLane].getText()+rank++);
	    		  lanes[whichLane].setText(lanes[whichLane].getText()+"winner");//GET去得數字 SET:將它顯示在PANEL上
	    		  stopGame();
	    		  break;
	    	  }
	    	   try {
					Thread.sleep((int)(Math.random()*200));//會有interrupt
				} catch (InterruptedException e) {//考!還沒睡醒就被叫醒
					break;
				}
	       }
		}

		private void stopGame() {
			for(int i=0;i<cars.length;i++){
	    		cars[i].interrupt();//中段執行緒 一樣有做完 只是跳過 較安全 不像STOPNSAFE
	    	}
			
		}

	}

	public static void main(String[] args) {
		new J0911Racing();
	}

}
