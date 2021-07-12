package kr.or.kh.obj;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		FileInputStream fi = null;
		InputStreamReader isr = null;
		BufferedReader bfr = null;
		
		try {
			
			
			fi= new FileInputStream("c:\\kh\\bufferedReader.txt");
			isr= new InputStreamReader(fi);
			bfr= new BufferedReader(isr);
			String str= null;
			while((str= bfr.readLine())!=null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fi.close();
				isr.close();
				bfr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
