package tw.org.iii_3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

import org.omg.CORBA.portable.OutputStream;

public class J090405_TCPclient1 {
//send
	public static void main(String[] args) {
		try {
			Socket socket=new Socket(InetAddress.getByName("127.0.0.1"),8888);//�T��洤 �s�L�h�B�@�Nť
			java.io.OutputStream out= socket.getOutputStream();
			out.write("hellooooo".getBytes());//��X
			out.flush();
			out.close();
			
			socket.close();
		} catch (IOException e) {
			
		}

	}

}
