package kr.or.kh.obj3;
	
//포함관계  has-a       //포함관계와 상속관계는 다르다!
public class Car {
	
	
	public Engine engine;
	public Door[] door;
	
	
	public Car() {
		super();
		
		engine=new Engine();
		
		
		door=new Door[4];
		door[0]=new Door();
		door[1]=new Door();
		door[2]=new Door();
		door[3]=new Door();
	}


	@Override
	public String toString() {
		return "Car [engine=" + engine + ", door=" + door + "]";
	}
	
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.engine.kind="대우엔진";
		
		car.door[0].window=1;
		car.door[1].window=2;
		car.door[2].window=3;
		car.door[3].window=4;
	System.out.println(car.engine.kind);
	System.out.println(car.door[0].window);
	System.out.println(car.door[1].window);
	System.out.println(car.door[2].window);
	System.out.println(car.door[3].window);
	}
}
