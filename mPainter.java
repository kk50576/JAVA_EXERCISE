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
	//實作兩個介面
	private  LinkedList<LinkedList<HashMap<String,Integer>>> lines,recycle;// 是一個LINKED LIST結構 用字串當KEY用整數當其值
	//MAP是典 很多個點構成一條線 
	public mPainter(){
		System.out.println("a");
		myAdapter adapter= new myAdapter();//可選擇要OVERRIDE哪些
		addMouseListener(adapter);//寫在建構式 因為只要做一次
		addMouseMotionListener(adapter);
		lines=new LinkedList<>();//建構他
		recycle=new LinkedList<>();
		//super()
        //setBackground(Color.yellow);
	}
@Override
//任何時候看到的畫面長相
protected void paintComponent(Graphics g) {//paintComponent  繪圖的物件實體
	super.paintComponent(g);//第一行通常是SUPER 把父親的功能做完再做SUPER
	Graphics2D g2d=(Graphics2D)g;//把他轉型回來
	g2d.setColor(Color.BLUE);
	g2d.setStroke(new BasicStroke(4));//設定粗細
	
for(LinkedList<HashMap<String,Integer>>line :lines){//很多條線裡的一條線
	for(int i=1;i<line.size();i++){//先選出一個點
		HashMap<String, Integer> p0=line.get(i-1);//一個點
		HashMap<String, Integer> p1=line.get(i);//上一點跟這一點化成一個現段
		int p0x=p0.get("x"),p0y=p0.get("y");//取回那一個點的XY
		int p1x=p1.get("x"),p1y=p1.get("y");
		g2d.drawLine(p0x, p0y, p1x, p1y);//可改寫成(p0.get("x"),p0.get("Y"),...)
	}
}
}
//開發按鈕的功能
void clear(){
	lines.clear();
	repaint();
}

void undo(){
	if(lines.size()>0)
		recycle.add(lines.removeLast());//丟掉的由RECYCLE來撿回
	repaint();
}

void redo(){
	lines.add(recycle.removeLast());//將丟掉的再放回LINES
	repaint();
}
void save(){
	
}


//	g2d.fillOval(100, 100, 30, 30);//塗滿
//	g2d.drawOval(100, 100, 30, 30);
//	g2d.drawLine(x1, y1, x2, y2);

private class myAdapter extends MouseAdapter{//右建-source-override
	@Override
	public void mouseDragged(MouseEvent e) {
		super.mouseDragged(e);
		addPoint(e);
		repaint();//內不類別直接呼叫外不類別的方法即屬性
	}
	@Override
	public void mousePressed(MouseEvent e) {
		super.mousePressed(e);
		LinkedList<HashMap<String, Integer>> line=new LinkedList<>();
		//按下滑鼠除了產生一個點 並當場做一條線
		lines.add(line);
		addPoint(e);
	}
	private void addPoint(MouseEvent e){//設計一個讓其他來呼叫=>維護性高
		HashMap<String, Integer> point=new HashMap<>();		
		point.put("x",e.getX());
		point.put("y",e.getY());//point只是區域變數 雇用LINE屬性 ADD進去
		lines.getLast().add(point);//和十多一條心線? 加在最後一條
	}
	
}
//private class MyPoint{
//	private int x,y;
//	void setXY(int x,int y) {
//	}
	
}


