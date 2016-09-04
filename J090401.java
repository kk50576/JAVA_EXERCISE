package tw.org.iii_3;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class J090401 {

	public static void main(String[] args) {
		try {
			InetAddress[] ips=InetAddress.getAllByName("www.microsoft.com.tw");//主機名稱 HTTP是URL
			for(InetAddress ip:ips){
				System.out.println(ip.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			 System.out.println("no");
		}

	}

}
