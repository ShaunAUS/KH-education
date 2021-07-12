package kr.or.kh.obj;

import java.io.FileWriter;

public class BufferedWriter {

	public static void main(String[] args) {
		FileWriter= fileW= null;
		BufferedWriter buW = null;
		
		try {
			fileW =new FilewWriter("c:\\kh\\bufferWriter3.txt");
			buW = new BufferedWriter(fileW,4);
			buW.write("여러라인출력예제1라인");
			buW.newLine();
			buW.Write("여러라인 출력예쩨 2");
			buW.write("여러라인출력 예제3");
			buW.write("여러라인ㅊㄹ격4");
			buW.newLine();
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				buW.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
