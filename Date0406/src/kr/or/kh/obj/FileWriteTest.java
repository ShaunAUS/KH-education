package kr.or.kh.obj;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {

	public static void main(String[] args) {
		FileWriter fw = null;
		String msg = "FileWriter테스트";
		try {
			fw = new FileWriter("c:\\kh\\filewriter.txt",true);
			fw.write(msg);
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}

	}

}
