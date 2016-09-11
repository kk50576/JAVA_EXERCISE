package tw.org.iii_3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class mPainter extends JPanel //implements MouseListener,MouseMotionListener
{    
	//��@��Ӥ���
	private  LinkedList<LinkedList<HashMap<String,Integer>>> lines,recycle;// �O�@��LINKED LIST���c �Φr���KEY�ξ�Ʒ���
	//MAP�O�� �ܦh���I�c���@���u 
	public mPainter(){
		System.out.println("a");
		myAdapter adapter= new myAdapter();//�i��ܭnOVERRIDE����
		addMouseListener(adapter);//�g�b�غc�� �]���u�n���@��
		addMouseMotionListener(adapter);
		lines=new LinkedList<>();//�غc�L
		recycle=new LinkedList<>();
		//super()
        //setBackground(Color.yellow);
	}
@Override
//����ɭԬݨ쪺�e������
protected void paintComponent(Graphics g) {//paintComponent  ø�Ϫ��������
	super.paintComponent(g);//�Ĥ@��q�`�OSUPER ����˪��\�వ���A��SUPER
	Graphics2D g2d=(Graphics2D)g;//��L�૬�^��
	g2d.setColor(Color.BLUE);
	g2d.setStroke(new BasicStroke(4));//�]�w�ʲ�
	
for(LinkedList<HashMap<String,Integer>>line :lines){//�ܦh���u�̪��@���u
	for(int i=1;i<line.size();i++){//����X�@���I
		HashMap<String, Integer> p0=line.get(i-1);//�@���I
		HashMap<String, Integer> p1=line.get(i);//�W�@�I��o�@�I�Ʀ��@�Ӳ{�q
		int p0x=p0.get("x"),p0y=p0.get("y");//���^���@���I��XY
		int p1x=p1.get("x"),p1y=p1.get("y");
		g2d.drawLine(p0x, p0y, p1x, p1y);//�i��g��(p0.get("x"),p0.get("Y"),...)
	}
}
}
//�}�o���s���\��
void clear(){
	lines.clear();
	repaint();
}

void undo(){
	if(lines.size()>0)
		recycle.add(lines.removeLast());//�ᱼ����RECYCLE�Ӿߦ^
	repaint();
}

void redo(){
	lines.add(recycle.removeLast());//�N�ᱼ���A��^LINES
	repaint();
}
void save(){
	
}


//	g2d.fillOval(100, 100, 30, 30);//�
//	g2d.drawOval(100, 100, 30, 30);
//	g2d.drawLine(x1, y1, x2, y2);

private class myAdapter extends MouseAdapter{//�k��-source-override
	@Override
	public void mouseDragged(MouseEvent e) {
		super.mouseDragged(e);
		addPoint(e);
		repaint();//�������O�����I�s�~�����O����k�Y�ݩ�
	}
	@Override
	public void mousePressed(MouseEvent e) {
		super.mousePressed(e);
		LinkedList<HashMap<String, Integer>> line=new LinkedList<>();
		//���U�ƹ����F���ͤ@���I �÷�����@���u
		lines.add(line);
		addPoint(e);
	}
	private void addPoint(MouseEvent e){//�]�p�@������L�өI�s=>���@�ʰ�
		HashMap<String, Integer> point=new HashMap<>();		
		point.put("x",e.getX());
		point.put("y",e.getY());//point�u�O�ϰ��ܼ� ����LINE�ݩ� ADD�i�h
		lines.getLast().add(point);//�M�Q�h�@���߽u? �[�b�̫�@��
	}
	
}
//private class MyPoint{
//	private int x,y;
//	void setXY(int x,int y) {
//	}
	
}


