package kr.or.kh.obj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest1 {

	public static void main(String[] args) {
		FileWriter FileW = null;
		BufferedWriter buW = null;
		
		try {
			FileW = new FileWriter("c\\kh\\bufferWriter.txt");
			buW = new BufferedWriter(FileW,4);
			buW.write('A');
			buW.write('B');
			buW.write('C');
			buW.write('D');
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				buW.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
