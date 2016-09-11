package tw.org.iii_3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class J091103 extends JFrame{
private mPainter painter;
private JButton clear,undo,redo,save;
  public J091103(){ 
	  setLayout(new BorderLayout());//©I¥sborderLayout
	  painter=new mPainter();
	  clear=new JButton("clear");
	  undo=new JButton("undo");
	  redo=new JButton("redo");
	  save=new JButton("save");
	  JPanel top=new JPanel(new FlowLayout(FlowLayout.LEFT));
	  top.add(clear);
	  top.add(undo);
	  top.add(redo);
	  top.add(save);
	  add(top,BorderLayout.NORTH);
	  add(painter,BorderLayout.CENTER);
	  
	  setSize(800,600);
	  setVisible(true);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	  
	  setupEvent();
  }

  
  private void setupEvent(){
	  clear.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent arg0) {
			doclear();
		}
		});
	  
	  undo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				doundo();
			}
			});
	  
	  redo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				doredo();
			}
			});
	  save.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				doredo();
			}
			});
	  
  }
  
	private void doclear(){
			painter.clear();
		}
	
	private void doundo(){
		painter.undo();
	}
	
	private void doredo(){
		painter.redo();
	}
	private void dosave(){
		BufferedImage bi=new BufferedImage(painter.getWidth(), painter.getHeight(),BufferedImage.TYPE_INT_ARGB);
		Graphics g=bi.createGraphics();
		painter.paint(g);//this==JCOMPONENT  ¦sPAINTER
		g.dispose();
		try{
			ImageIO.write(bi, "png", new File("dir1/test.png"));
		
	}
		catch(Exception e){
	}
	}
	public static void main(String[] args) {
		new J091103();

	}

}
