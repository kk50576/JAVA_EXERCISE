package tw.org.iii_3;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class J090406_TCPreceive {

	public static void main(String[] args) {
		//server���[��
		ServerSocket server;
		try {
			server = new ServerSocket(6666);
			//server.accept();
			Socket socket=server.accept();
			
			InputStream in=socket.getInputStream();	
			int c;
			StringBuffer sb=new StringBuffer();//�|�@���֥[���A��
			while((c=in.read())!=-1){//�@���W�@�Ӧr��
				sb.append((char)c);
			}
			
			//���o�O��InetAddress
		InetAddress urip=socket.getInetAddress();
			
			server.close();
			System.out.println(urip.getHostAddress()+sb);//Ū�r�����O����
			
		} catch (IOException e) {
			
		}
				

	}

}
