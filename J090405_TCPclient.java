package tw.org.iii_3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.io.OutputStream;


public class J090405_TCPclient {
//send
	public static void main(String[] args) {
		//1 read from local filesystem
		long start=System.currentTimeMillis();
		try {
			File sendFile=new File("dir1/cc.jpg");//�p��n�ǳƦh�j���֤l
			byte[] sendBuf=new byte[(int)sendFile.length()];	
			BufferedInputStream bin=new BufferedInputStream(new FileInputStream(sendFile));//��y�@����i��
			bin.read(sendBuf);
			bin.close();
		//2 send by TCP
			Socket client=new Socket(InetAddress.getByName("127.0.0.1"),6666);//�T��洤
			BufferedOutputStream bout=new BufferedOutputStream(client.getOutputStream()) ;  //���o��X��y��ibuffer
			bout.write(sendBuf);
			client.close();
			bout.flush();
			bout.close();
			
			System.out.println("OK");
			System.out.println(System.currentTimeMillis()-start);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}
}