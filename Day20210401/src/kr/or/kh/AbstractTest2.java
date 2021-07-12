package kr.or.kh;


//추상 클래스 추상클래스 상속 가능
abstract class AbClass1{
	abstract void abMethod();
}



abstract class AbClass2 extends AbClass1{
	abstract void abMethod2();
}

class GeneralClass extends AbClass2{

	@Override
	void abMethod2() {
		System.out.println("abMethod1수행");
	}

	@Override
	void abMethod() {
		System.out.println("abMethod 2 수행");
		
	}
	
}
public class AbstractTest2 {

	public static void main(String[] args) {
		
		GeneralClass gc= new GeneralClass();
		gc.abMethod();
		gc.abMethod2();
	}

}
