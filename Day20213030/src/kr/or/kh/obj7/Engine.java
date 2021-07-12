package kr.or.kh.obj7;

public class Engine {

	String name;

	public Engine() {
		super();
		
	}

	public Engine(String name) {
		super();
		this.name = name;
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Engine [name=" + name + "]";
	}
	

	
	
	public static void main(String[] args) {
		
		Engine engine=new Engine("삼성엔진");
		
	}
	
}
