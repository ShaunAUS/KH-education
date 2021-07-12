package kr.or.kh;
//상속과 구현



class Vehicle1{
	
 public  void move() {
	 System.out.println("움직인다");
 }

}


interface Flyable{
	public abstract void fly();
}


class Interface2Impl extends Vehicle1 implements Flyable{

	@Override
	public void fly() {
		System.out.println("하늘을 난다");
	}
	
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		Interface2Impl in2Impl = new Interface2Impl();
		in2Impl.fly();
		in2Impl.move();

	}

}
