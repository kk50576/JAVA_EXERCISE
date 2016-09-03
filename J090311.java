package tw.org.iii_3;


	import java.awt.BorderLayout;
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
	import javax.swing.JFileChooser;
	import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class J090311 extends JFrame {



		private JButton open, save, exit;
		private JTextArea edit;
		private File openFile;

		public J090311(){
			super("My Window App");
			
			open = new JButton("Open");
			save = new JButton("Save");
			exit = new JButton("Exit");
			edit = new JTextArea();
			JScrollPane jsp=new JScrollPane(edit);//把edit放入了 故底下add要改為JSP
			
			setLayout(new BorderLayout());
			JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
			top.add(open);top.add(save);top.add(exit);
			add(top, BorderLayout.NORTH);
			add(jsp, BorderLayout.CENTER);
			 
			open.addActionListener(new ActionListener() {	
				@Override
				public void actionPerformed(ActionEvent e) {		
					doOpen();
				}
			});
			
			
			save.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					doSave();			
				}	
			});
		
							
			setSize(640, 480);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		//***********open
		private void doOpen(){
			JFileChooser jfc=new JFileChooser();
			if(jfc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
			openFile=jfc.getSelectedFile();	
			readFile();
			System.out.println(openFile.getAbsolutePath());
			}
			
		}
		
		//******save
		private void doSave(){
			if(openFile!=null){
				try {
					FileWriter writer=new FileWriter(openFile);
					writer.write(edit.getText());
				//	JOptionPane.showDialog("okok");
					writer.flush();
					writer.close();
			
				} catch (IOException e) {
					
				}
			}
		}
		
	//*********read file
	private void readFile(){
		try {
			FileReader reader=new FileReader(openFile);
			int c;
			while((c=reader.read())!=-1){
				edit.append(""+(char)c);//將他轉為字串
			}
			reader.close();
		} catch (Exception e) {//都用exception去承接
			
		}
	}

	public static void main(String[] args) {
	 new J090311();

	}

}
