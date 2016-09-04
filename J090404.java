package tw.org.iii_3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class J090404 {
//糾收UDP
	public static void main(String[] args) {
		
		//while (true){
		byte[] buf=new byte[1024];//自行設定大小
		try {
			DatagramSocket socket=new DatagramSocket(8888);
			
			DatagramPacket packet= new DatagramPacket(buf, buf.length);
			System.out.println("before");
			socket.receive(packet);
			System.out.println("after");
			socket.close();
			InetAddress urip= packet.getAddress();//資料一訂在封包中
			byte[] data= packet.getData();//看接收的資料
			int len=packet.getLength();
			
			System.out.println(urip.getHostAddress()+new String(data,0,len));
		} catch (Exception e) {
		System.out.println(e.toString());
		}
		

	}

}
