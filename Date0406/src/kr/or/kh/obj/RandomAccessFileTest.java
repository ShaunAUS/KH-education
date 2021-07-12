package kr.or.kh.obj;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) {
		try {
			raf= new RandomAccessFile("c:\\kh\\random.txt","rw");
			RandomAccessFile raf = null;
			System.out.println("시작파일 포인터"+raf.getFilePointer());
			raf.writeInt(75);
			raf.writeBoolean(false);
			raf.writeChar('a');
			raf.writeLong(100);
			System.out.println("데이터출력파일포인터:"+raf.getFilePointer());
			raf.seek(0);
			System.out.println("int값 출력"+raf.readInt());
			System.out.println("boolean값 출력"+raf.readBoolean());
			raf.skipBytes(2);
			System.out.println("long값 출력" +raf.readLong());
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
