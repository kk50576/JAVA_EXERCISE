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
		//server���[��
		ServerSocket server;
		try {
			server = new ServerSocket(8888);
			//server.accept();
			Socket socket=server.accept();
			
			BufferedInputStream bin =new BufferedInputStream(socket.getInputStream());
			BufferedOutputStream bout=new BufferedOutputStream(//Ū�i�ɮ�
					new FileOutputStream("upload/brad.jpg"));//�T�w�ҦW
			
			int b;
			while((b=bin.read())!=-1){//�@��BYTEŪ
				bout.write(b);  //�N���Ū�񪺸�ƿ�X
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
