package tw.org.iii_3;

import java.util.Timer;
import java.util.TimerTask;

public class J0911TIMER {

	public static void main(String[] args) {
		Timer timer=new Timer();
		timer.schedule(new MyTask1(), 3000);//3¬í
		timer.schedule(new MyTask2(timer), 1000,1000);
	}
	}
class MyTask1 extends TimerTask{
	@Override
	public void run() {
		System.out.println("mytask1");
	}
}
class MyTask2 extends TimerTask{
		private int i;
		private Timer timer;
		MyTask2 (Timer timer){this.timer=timer;}
		@Override
		public void run() {
			System.out.println("mytask2"+ i++);
		   if(i>10){
			   timer.cancel();
		   }
		}
		
}
