package kr.or.kh;

abstract class Vehicle{  //추상클래스
	abstract void move();
}
class Car extends Vehicle{

	@Override
	void move() {
		System.out.println("차도로 다닌다.");
		
	}
	
}
class Plane extends Vehicle{

	@Override
	void move() {
		System.out.println("비행기로 다닌다");
	
}
	

public class AbstractTest3 {

	public static void main(String[] args) {
		Car car= new Car();
		Plane plane =new Plane();
		//Vehicle vehilce= new Car();
		//Vehicle vehilce= new Plane();
		
		VehicleUse vUse= new VehicleUse();
		vUse.getMoveStyle(car);
		vUse.getMoveStyle(plane);

	}

}}

