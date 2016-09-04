package tw.org.iii_3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class J090402 {

	public static void main(String[] args) {
		//sender(UDP)
		
			
		String data="hello world";
		byte[] sendData=data.getBytes();
		try {
			DatagramSocket socket=new DatagramSocket();
			DatagramPacket packet=new DatagramPacket(sendData,
					sendData.length,InetAddress.getByName("10.2.24.106"),8888);//port num:8888
			socket.send(packet);//¶Ç°e«Ê¥]
			socket.close();	
			System.out.println("send OK");
		} 
		
		
		  catch (SocketException e) {
		}
		
		  catch (UnknownHostException ue) {
		} 
		
		catch (IOException e) {
		}
		
		
	}

}
