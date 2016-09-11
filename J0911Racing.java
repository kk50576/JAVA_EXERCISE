package tw.org.iii_3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class J0911Racing extends JFrame {
	private JButton go;
	private JLabel[] lanes;// �]��O�}�C
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
		go.addActionListener(new ActionListener() {// GO���䪺�ʧ@
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
	}

	private void go() {
		rank = 1;
		cars = new car[8];
		for (int i = 0; i < cars.length; i++) {// �M�]�D
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
	       for(int i=0;i<100;i++){//�g�غc�O�����l�]�b���T���]�D
	    	   lanes[whichLane].setText(lanes[whichLane].getText()+">");//�s�X��Ӧb�~��e>
	    	  if(i==99){//�̫�@�ӦC�L�X�W��
	    		//  lanes[whichLane].setText(lanes[whichLane].getText()+rank++);
	    		  lanes[whichLane].setText(lanes[whichLane].getText()+"winner");//GET�h�o�Ʀr SET:�N����ܦbPANEL�W
	    		  stopGame();
	    		  break;
	    	  }
	    	   try {
					Thread.sleep((int)(Math.random()*200));//�|��interrupt
				} catch (InterruptedException e) {//��!�٨S�ο��N�Q�s��
					break;
				}
	       }
		}

		private void stopGame() {
			for(int i=0;i<cars.length;i++){
	    		cars[i].interrupt();//���q����� �@�˦����� �u�O���L ���w�� ����STOPNSAFE
	    	}
			
		}

	}

	public static void main(String[] args) {
		new J0911Racing();
	}

}
