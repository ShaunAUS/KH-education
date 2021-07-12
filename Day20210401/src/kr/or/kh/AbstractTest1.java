package kr.or.kh;

abstract class AbstractClass{
	
		int age;
		void generalMethod() {
			System.out.println("일반메소드");
		
			
		}
		
		
		abstract void abstractMethod();
		
		
		
}
class AbstractChildClass extends AbstractClass{

	@Override
	void abstractMethod() {
		
	System.out.println("추상메서드 구현");
		
		
	}
	
}
public class AbstractTest1 {

	public static void main(String[] args) {
		
		
	}

}
