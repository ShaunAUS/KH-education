package kr.or.kh.obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	
	
	InputStreamReader isr;  //클래스는 디폴트생성자가 저절로 초기화 해서 null 안써도댐
	BufferedReader bfr;
	
	public static void main(String[] args) {
			InputStreamReaderTest isrt = new InputStreamReaderTest();
			User user= isrt.getUserInfo();
			System.out.println("입력한 사용자 정보:");
			System.out.println(user);
	}
	private User getUserInfo() {
		User user= null;
		isr = new InputStreamReader(System.in);
		bfr = new BufferedReader(isr);
		
		try {
			System.out.println("사용자 정보를 입력하세요:");
			System.out.println("아이디:");
			String id = bfr.readLine();
			System.out.println("비밀번호:");
			String passwd= bfr.readLine();
			System.out.println("동");
			String dong = bfr.readLine();
			System.out.println("나이");
			int age = Integer.parseInt(bfr.readLine());
			System.out.println("이름:");
			String irum = bfr.readLine();
			user = new User(id,passwd,dong,age,irum);
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				isr.close();
				bfr.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
		}
		return user;
	}
}
