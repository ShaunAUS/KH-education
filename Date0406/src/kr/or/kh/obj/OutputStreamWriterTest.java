package kr.or.kh.obj;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {
	public static void main(String[] args) {
		FileOutputStream fileOutputS = null;
		OutputStreamWriter outwriter = null;
		BufferedWriter buffW= null;
		
		try {
			fileOutputS = new FileOutputStream("c:\\kh\\outputStream.txt");
			outwriter= new OutputStreamWriter(fileOutputS);
			buffW = new BufferedWriter(outwriter);
			buffW.write("아우풋스트림데이터");
			buffW.newLine();
			buffW.write("kh정보교육원");
			buffW.newLine();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		} finally{
			try {
				buffW.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}
