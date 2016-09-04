package tw.org.iii_3;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class J090406_TCPreceive {

	public static void main(String[] args) {
		//server的觀念
		ServerSocket server;
		try {
			server = new ServerSocket(6666);
			//server.accept();
			Socket socket=server.accept();
			
			InputStream in=socket.getInputStream();	
			int c;
			StringBuffer sb=new StringBuffer();//會一直累加的適用
			while((c=in.read())!=-1){//一次獨一個字元
				sb.append((char)c);
			}
			
			//取得是誰InetAddress
		InetAddress urip=socket.getInetAddress();
			
			server.close();
			System.out.println(urip.getHostAddress()+sb);//讀字元不是圖檔
			
		} catch (IOException e) {
			
		}
				

	}

}
