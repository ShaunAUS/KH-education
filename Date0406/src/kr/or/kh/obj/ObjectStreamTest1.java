package kr.or.kh.obj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest1 {

	public static void main(String[] args) {
		User1 beforUser1= new User1("aaa","aaa","동판교",22,"김민재");
		User1 afterUser1=null;
		FileOutputStream fileos=null;
		
		ObjectOutputStream objectos=null;
		FileInputStream fileis = null;
		ObjectInputStream objectis=null;
		
		
	
		try {
			fileos=new FileOutputStream("c:\\kh\\userInfor.ser");
			objectos = new ObjectOutputStream(fileos);
			objectos.writeObject(beforUser1);
			
			fileis=new FileInputStream("c\\KH\\userInfo.ser");
			objectis=new ObjectInputStream(fileis);
			afterUser1= (User1)objectis.readObject();
			System.out.println(afterUser1);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fileos.close();
				fileis.close();
				objectos.close();
				objectis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}

