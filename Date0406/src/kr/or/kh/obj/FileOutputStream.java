package kr.or.kh.obj;

public class FileOutputStream {
	
	
	
	public static void main(String[] args) {
		FileOutputStream fo =null;
		String msg= "FileOutputStreamTestKh";
		byte[] byteArray=msg.getBytes();    //msg를 바이트로 쪼갠다
		try {
			fo= new FileOutputStream("c:\\kh\\fileoutput.txt",true);
			fo.write(byteArray);
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				fo.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}

	}

}
