package kr.or.kh.obj6;
		//상속관계 포함관계 구분 // 이거는 포함관계
public class Car {
	
	protected Engine engine;
	protected Door door;
	
	
	public Car() {
		this.engine=new Engine();
		this.door=new Door();
		
		
	}
	
	public Car(Engine engine, Door door) {
		super();
		this.engine = engine;
		this.door =door;
	}
	
	
	
	@Override
	public String toString() {
		return "Car [engine=" + engine.kind + ", door=" + door.window + "]";
	}
	public static void main(String[] args) {
		Car car1=new Car();
		System.out.println(car1.toString());
		
		Car car2=new Car(new Engine("삼성엔진"),new Door(4));
		System.out.println(car2.toString());
	}
	

}
