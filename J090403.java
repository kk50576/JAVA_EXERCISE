package tw.org.iii_3;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class J090403 {

	public static void main(String[] args) {
		try {
			InetAddress ip=InetAddress.getByName("www.microsoft.com.tw");//�D���W�� HTTP�OURL
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			 System.out.println("no");
		}

	}

}
