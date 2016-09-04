package tw.org.iii_3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.io.OutputStream;


public class J090405_TCPclient3 {
//send
	public static void main(String[] args) {
		//1 read from local filesystem
		long start=System.currentTimeMillis();
		try {
			Socket client=new Socket(InetAddress.getByName("127.0.0.1"),6666);//�T��洤���\
			OutputStream out=client.getOutputStream();			//���o��X��y
			BufferedOutputStream bout=new BufferedOutputStream(client.getOutputStream());//��ibuffer�z
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream("dir1/cc.jpg"));//Ū��
			
			int b;
			while((b=bin.read())!=-1){
				bout.write(b);//Ū�i�@�ӴN�кޤl�e�X�h
			}
			
			bin.close();
			bout.flush();
			bout.close();
			client.close();
			System.out.println("OK");
			System.out.println(System.currentTimeMillis()-start);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}
}