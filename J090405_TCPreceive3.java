package tw.org.iii_3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class J090405_TCPreceive3 {

	public static void main(String[] args) {
		//server的觀念
		ServerSocket server;
		try {
			server = new ServerSocket(8888);
			//server.accept();
			Socket socket=server.accept();
			
			BufferedInputStream bin =new BufferedInputStream(socket.getInputStream());
			BufferedOutputStream bout=new BufferedOutputStream(//讀進檔案
					new FileOutputStream("upload/brad.jpg"));//固定黨名
			
			int b;
			while((b=bin.read())!=-1){//一個BYTE讀
				bout.write(b);  //將剛剛讀近的資料輸出
			}
			
			bin.close();
			
			server.close();
			bout.flush();
			bout.close();
     System.out.println("OK");
			
		} catch (IOException e) {
		System.out.println("SERVER"+e.toString());	
		}
				

	}

}
