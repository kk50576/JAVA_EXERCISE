package tw.org.iii_3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class J090404 {
//�Ȧ�UDP
	public static void main(String[] args) {
		
		//while (true){
		byte[] buf=new byte[1024];//�ۦ�]�w�j�p
		try {
			DatagramSocket socket=new DatagramSocket(8888);
			
			DatagramPacket packet= new DatagramPacket(buf, buf.length);
			System.out.println("before");
			socket.receive(packet);
			System.out.println("after");
			socket.close();
			InetAddress urip= packet.getAddress();//��Ƥ@�q�b�ʥ]��
			byte[] data= packet.getData();//�ݱ��������
			int len=packet.getLength();
			
			System.out.println(urip.getHostAddress()+new String(data,0,len));
		} catch (Exception e) {
		System.out.println(e.toString());
		}
		

	}

}
