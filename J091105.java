package tw.org.iii_3;

import tw.org.iii_3.Brad681.Brad682;

public class J091105 {
//只想要表現出執行緒的特徵:一定要繼承THREAD!!!!
	public static void main(String[] args) {
		 Brad681 obj1=new Brad681("A",200);//有傳參數的建構式
		 Brad681 obj2=new Brad681("B",300);
		 Brad682 obj3=new Brad682("C",150);
		 Thread t3=new Thread(obj3);
		 obj1.start();//一定要呼叫START 表現生命週期 執行緒才有START方法 會去教RUN方法來實作//obj1.run();	
		 obj2.start();//不是開始去表現生命 而是可以開始去"等候" 給CPU作後選(不是馬上執行)
		 t3.start();
		 try{
			 obj2.join();//
		 }catch(InterruptedException e){
			 
		 }
	     System.out.println("main");//何時執行??
	}
}

class Brad681 extends Thread{//繼承只能一個 只能去實作多個介面了 故擴充性較低
	private String name;
	private int delay;
	Brad681(String name,int delay)
		{this.name=name;
		this.delay=delay;}
	@Override//定義類別存在的意義
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100);//間隔0.1秒
			} catch (InterruptedException e) {//考!還沒睡醒就被叫醒
				
			}
		}
	}
	
	class Brad682 implements Runnable{//執行緒的第二種處理模式  繼承物件實作RUNNABLE故不是執行緒
		private String name;
		private int delay;
		Brad682(String name,int delay)
			{this.name=name;
			this.delay=delay;}
		@Override//定義類別存在的意義
		public void run(){
			for(int i=0;i<10;i++){
				System.out.println(name+":"+i);
				try {
					Thread.sleep(100);//間隔0.1秒
				} catch (InterruptedException e) {//考!還沒睡醒就被叫醒
					
				}
			}
		}
	}
}
