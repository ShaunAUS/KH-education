package kr.or.kh.obj7;
 //engine radio ---->car 포함관계


public class Car {

		Engine engine;		//객체							//작은 클래스를 변수로 
		Radio radio;		//객체
		


	public Car() {
		engine=new Engine();		//객체							//생성자= 작은생성자
		radio=new Radio();			//객체
					
}
	
	
	
	public Car(Engine engine, Radio radio) {					//객체를 값으로 받는다//객체가 변수니까
		
		this.engine = engine;
		this.radio = radio;
	}
	
	
	
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", radio=" + radio + "]";
	}
	
	
	
	public static void main(String[] args) {
		
		Car car=new Car();							//객체들 기본 생성자로 부르기
		System.out.println(car.toString());
		
		
		Engine engine=new Engine("삼성엔진");			
		Radio radio=new Radio(10);
		
		
		Car car1=new Car(engine,radio);				//매개변수 생성자로 (매개)객체들부르기
		System.out.println(car1.toString());
		
		
		
	}
}

