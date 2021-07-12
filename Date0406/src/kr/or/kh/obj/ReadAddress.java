package kr.or.kh.obj;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadAddress {
// 메인함수에서는 어떤값이든 넣어줘라
	public static void main(String[] args) {
		FileInputStream fi = null;
		InputStreamReader isr= null;
		BufferedReader bfr = null;
		StringTokenizer st = null;
		
		fi= new FileInputStream("c:\\kh\\address.txt");
		isr= new InputStreamReader(fi);
		bfr= new BufferedReader(isr);
		String str= null;
		while((str= bfr.readLine())!null) {
			st=StringTokenizer(str,",");
			System.out.println("이름:"+st.nextToken()+",주소:"+st.nextToken()+",전화번호:"();
		}
	}

}
