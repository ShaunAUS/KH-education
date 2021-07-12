package kr.or.kh.obj;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		FileOutputStream fo =null;
		FileInputStream fi = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
try {
	fo = new FileOutputStream("c:\\KH\\dataFile.txt");
			fi= new FileInputStream("c:\\KH\\dataFile.txt");
			dos= new DataOutputStream(fo);
			dis = new DataInputStream(fi);
		
			dos.writeShort(-1);
			dos.writeByte(2);
			dos.writeDouble(3.14);
			dos.writeLong(30);
			dos.writeUTF("datastreamTest");
			System.out.println(dis.readUnsignedShort());
			dis.skip(1);
			System.out.println(dis.readDouble());
			System.out.println(dis.readLong());
			System.out.println(dis.readUTF());
} catch (FileNotFoundException e) {
	
	e.printStackTrace();
} catch (IOException e) {
	
	e.printStackTrace();
}finally {
	try {
		fi.close();
		fo.close();
		dos.close();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
	

	}}
