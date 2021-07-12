package kr.or.kh;
 //예외 처리 만들기 
public class ArgsException extends Exception {

	private int argNumber;

	public ArgsException() {};

	
	public ArgsException(String msg) {			//생성자
		super(msg);
		
	}

	public int getArgNumber() {
		return argNumber;
	}

	public void setArgNumber(int argNumber) {
		this.argNumber = argNumber;
	}
	
	
	
}
