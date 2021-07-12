package kr.or.kh.obj6;

public class GmCar extends Car {

	
	protected int wheels;
	
	
	public GmCar() {
		super();
		
	}

	public GmCar(Engine engine, Door door, int wheels) {
		super(engine, door);
		this.wheels=wheels;
		
	}
	
	

	@Override
	public String toString() {
		return super.toString()+"GmCar [wheels=" + wheels + "]";
	}

	/*
	public static void main(String[] args) {
		
		Engine engine= new Engine("gm엔진");
		Door door= new Door(4);
		
		GmCar gmcar= new GmCar(engine,door,4);
		System.out.println(gmcar);
		*/
	}

