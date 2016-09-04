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
			File sendFile=new File("dir1/cc.jpg");//計算要準備多大的盆子
			byte[] sendBuf=new byte[(int)sendFile.length()];	
			BufferedInputStream bin=new BufferedInputStream(new FileInputStream(sendFile));//串流一次塞進來
			bin.read(sendBuf);
			bin.close();
		//2 send by TCP
			Socket client=new Socket(InetAddress.getByName("127.0.0.1"),6666);//三方交握
			BufferedOutputStream bout=new BufferedOutputStream(client.getOutputStream()) ;  //取得輸出串流放進buffer
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