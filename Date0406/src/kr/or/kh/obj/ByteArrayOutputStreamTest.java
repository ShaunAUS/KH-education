package kr.or.kh.obj;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

//output을 배열에 쓴다
public class ByteArrayOutputStreamTest {

	public static void main(String[] args) {
		String msg= "ByteArrayOutputStream";
		ByteArrayOutputStream bao= null;
		try {
			bao= new ByteArrayOutputStream();
			bao.write(msg.getBytes());
			System.out.println("bao="+bao);
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				bao.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		

	}

}
