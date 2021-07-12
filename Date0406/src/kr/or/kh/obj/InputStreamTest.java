package kr.or.kh.obj;

import java.io.IOException;

public class InputStreamTest {

		public static void main(String[] args) {
			int var_byte='q';
			System.out.println("문자하나 입력하세요");
			
			do {
				try {
					var_byte=System.in.read();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				if(var_byte==10||var_byte==13)continue;
				if(var_byte=='q') break;
				System.out.println("읽은값:"+(char)var_byte);
			}while(true);
		}
}
