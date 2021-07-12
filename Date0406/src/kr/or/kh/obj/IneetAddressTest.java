package kr.or.kh.obj;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IneetAddressTest {

	public static void main(String[] args) {
		
		
		InetAddress ia = null;
		
		
		try {
			ia = InetAddress.getLocalHost();
			System.out.println(ia);
			
			ia= InetAddress.getByName("https://www.youtube.com/watch?v=P1zDndoy4pI&t=7s");
			System.out.println(ia);
			
			InetAddress[] aia= InetAddress.getAllByName("https://www.youtube.com/watch?v=P1zDndoy4pI&t=7s");
			for(int i = 1; i<aia.length;i++) {
				System.out.println(aia[i]);
			}
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}

	}

}
