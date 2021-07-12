package kr.or.kh.obj6;

public class Engine {
	
	String kind;

	public Engine() {
		super();
		
	}

	public Engine(String kind) {
		super();
		this.kind = kind;
	}

	
	
	@Override
	public String toString() {
		return "Engine [kind=" + kind + "]";
	}
	
	
}
