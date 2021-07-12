package kr.or.kh.obj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStream1 {
	
	public static void main(String[] args) {
		FileInputStream fin1= null;
		FileInputStream fin2= null;
		FileInputStream fin3= null;
		SequenceInputStream si1=null;
		SequenceInputStream si2= null;
		
		
			try {
				fin1= new FileInputStream("c:\\kh\\test1.txt");
				fin2 = new FileInputStream("c:\\kh\\test2.txt");
				fin3= new FileInputStream("c:\\kh\\test3.txt");
				Vector v=new Vector();
				
				v.add(fin1);
				v.add(fin2);
				v.add(fin3);
				Enumeration fins = v.elements();
				si1=new SequenceInputStream(fins);
				int var_readbyte=-1;
				while((var_readbyte=si1.read())!=-1) {
					System.out.println((char)var_readbyte);
				}
				System.out.println();
				fin1= new FileInputStream("c:\\kh\\test1.text");
				fin2= new FileInputStream("c:\\kh\\test2.text");
				si2 = new SequenceInputStream(fin1,fin2);
				var_readbyte=-1;
				while((var_readbyte=si2.read())!=-1) {
					System.out.println((char)var_readbyte);
				}
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			} finally {
				try {
					si1.close();
					si2.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
			
		
	
	}}
