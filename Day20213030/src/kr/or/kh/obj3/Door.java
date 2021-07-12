package kr.or.kh.obj3;
	
//포함관계 =작은단위를 큰다위 맴버변수로
public class Door {
	
	public int window;
	
	
	
	public Door() {
		super();
		
		window=4;
	}

	
	
	@Override
	public String toString() {
		return "Door [window=" + window + "]";
	}
	
}

